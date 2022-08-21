package online.pengpeng.mall.config;

import cn.hutool.core.util.ArrayUtil;
import lombok.AllArgsConstructor;
import online.pengpeng.mall.authorization.AuthorizationManager;
import online.pengpeng.mall.common.constant.AuthConstant;
import online.pengpeng.mall.component.RestAuthenticationEntryPoint;
import online.pengpeng.mall.component.RestfulAccessDeniedHandler;
import online.pengpeng.mall.filter.IgnoreUrlConfigRemoveJwtFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.SecurityWebFiltersOrder;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
import org.springframework.security.oauth2.server.resource.authentication.ReactiveJwtAuthenticationConverterAdapter;
import org.springframework.security.web.server.SecurityWebFilterChain;
import reactor.core.publisher.Mono;

/**
 * @author pengpeng
 * @date 2022/8/19
 * 资源服务器配置
 */
@Configuration
@AllArgsConstructor
@EnableWebFluxSecurity
public class ResourceServerConfig {
    private final AuthorizationManager authorizationManager;
    private final IgnoreUrlsConfig ignoreUrlsConfig;
    private final RestfulAccessDeniedHandler restfulAccessDeniedHandler;
    private final RestAuthenticationEntryPoint restAuthenticationEntryPoint;
    private final IgnoreUrlConfigRemoveJwtFilter ignoreUrlConfigRemoveJwtFilter;

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http.oauth2ResourceServer().jwt()
                .jwtAuthenticationConverter(jwtAuthenticationConverter());
        // 自定义处理JWT请求头过期或签名错误的结果
        http.oauth2ResourceServer().authenticationEntryPoint(restAuthenticationEntryPoint);
        // 对白名单路径，直接移除JWT请求头
        http.addFilterBefore(ignoreUrlConfigRemoveJwtFilter, SecurityWebFiltersOrder.AUTHENTICATION);

        http.authorizeExchange()
                // 白名单处理
                .pathMatchers(ArrayUtil.toArray(ignoreUrlsConfig.getUrls(), String.class))
                .permitAll()
                // 鉴权管理器配置
                .anyExchange()
                .access(authorizationManager)
                // 处理未授权
                .and().exceptionHandling()
                .accessDeniedHandler(restfulAccessDeniedHandler) // 未授权
                .authenticationEntryPoint(restAuthenticationEntryPoint) // 未认证

                .and().csrf().disable();
        return http.build();
    }

    @Bean
    public Converter<Jwt, ? extends Mono<? extends AbstractAuthenticationToken>> jwtAuthenticationConverter() {
        JwtGrantedAuthoritiesConverter jwtGrantedAuthoritiesConverter = new JwtGrantedAuthoritiesConverter();
        jwtGrantedAuthoritiesConverter.setAuthorityPrefix(AuthConstant.AUTHORITY_PREFIX);
        jwtGrantedAuthoritiesConverter.setAuthoritiesClaimName(AuthConstant.AUTHORITY_CLAIM_NAME);
        JwtAuthenticationConverter jwtAuthenticationConverter = new JwtAuthenticationConverter();
        jwtAuthenticationConverter.setJwtGrantedAuthoritiesConverter(jwtGrantedAuthoritiesConverter);
        return new ReactiveJwtAuthenticationConverterAdapter(jwtAuthenticationConverter);
    }

}
