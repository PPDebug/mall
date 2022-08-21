package online.pengpeng.mall.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author pengpeng
 * @date 2022/8/21
 */
@Configuration
@MapperScan({
        "online.pengpeng.mall.mapper",
        "online.pengpeng.mall.search.dao"
})
public class MyBatisConfig {
}
