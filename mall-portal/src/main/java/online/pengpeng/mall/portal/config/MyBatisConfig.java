package online.pengpeng.mall.portal.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author pengpeng
 * @date 2022/8/21
 * MyBatis 相关配置
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"online.pengpeng.mall.mapper", "online.pengpeng.mall.portal.dao"})
public class MyBatisConfig {

}
