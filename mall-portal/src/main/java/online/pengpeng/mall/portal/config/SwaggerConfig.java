package online.pengpeng.mall.portal.config;

import online.pengpeng.mall.common.config.BaseSwaggerConfig;
import online.pengpeng.mall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author pengpeng
 * @date 2022/8/21
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("online.pengpeng.mall.portal.controller")
                .title("mall前台系统")
                .description("mall前台相关接口")
                .contactName("ppdebug")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
