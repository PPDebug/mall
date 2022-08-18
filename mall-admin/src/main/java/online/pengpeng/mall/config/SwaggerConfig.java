package online.pengpeng.mall.config;

import online.pengpeng.mall.common.config.BaseSwaggerConfig;
import online.pengpeng.mall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author pengpeng
 * @date 2022/8/14
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("online.pengpeng.mall.controller")
                .title("mall后台系统")
                .description("mall后台相关接口文档")
                .contactName("ppdebug")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
