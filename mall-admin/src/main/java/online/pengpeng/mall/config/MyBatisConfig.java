package online.pengpeng.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author pengpeng
 * @date 2022/8/14
 * MyBatis相关配置
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"online.pengpeng.mall.mapper", "online.pengpeng.mall.dao"})
public class MyBatisConfig {
}
