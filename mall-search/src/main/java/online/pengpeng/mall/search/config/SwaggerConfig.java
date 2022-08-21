package online.pengpeng.mall.search.config;

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
                .apiBasePackage("online.pengpeng.mall.search.controller")
                .title("mall搜索系统")
                .description("mall搜索相关接口文档")
                .contactName("ppdebug")
                .enableSecurity(false)
                .build();
    }
}
