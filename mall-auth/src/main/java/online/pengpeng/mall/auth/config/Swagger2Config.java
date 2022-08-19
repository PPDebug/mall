package online.pengpeng.mall.auth.config;

import online.pengpeng.mall.common.config.BaseSwaggerConfig;
import online.pengpeng.mall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author pengpeng
 * @date 2022/8/18
 */
@EnableSwagger2
@Configuration
public class Swagger2Config extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("online.pengpeng.mall.auth.controller")
                .title("mall认证中心")
                .description("mall认证中心相关接口文档")
                .contactName("PPDebug")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }

}
