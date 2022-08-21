package online.pengpeng.mall.config;

import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author pengpeng
 * @date 2022/8/19
 */
@Configuration
public class FeignConfig {
    /**
     * 日志级别
     */
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> requestTemplate.header("x-access-token", "");
    }
}
