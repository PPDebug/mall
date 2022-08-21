package online.pengpeng.mall.filter;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.pengpeng.mall.common.constant.AuthConstant;
import online.pengpeng.mall.config.IgnoreUrlsConfig;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/19
 * 白名单路径访问时需要移除Jwt请求头
 */
@Component
@AllArgsConstructor
@Slf4j
public class IgnoreUrlConfigRemoveJwtFilter implements WebFilter {
    private final IgnoreUrlsConfig ignoreUrlsConfig;

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, WebFilterChain webFilterChain) {
        ServerHttpRequest request = exchange.getRequest();
        URI uri = request.getURI();
        PathMatcher pathMatcher = new AntPathMatcher();
        List<String> ignoreUrls = ignoreUrlsConfig.getUrls();
        for( String ignoreUrl : ignoreUrls) {
            if (pathMatcher.match(ignoreUrl, uri.getPath())) {
                request = request.mutate().header(AuthConstant.JWT_TOKEN_HEADER, "").build();
                exchange = exchange.mutate().request(request).build();
                return webFilterChain.filter(exchange);
            }
        }
        return webFilterChain.filter(exchange);
    }
}
