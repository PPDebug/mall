package online.pengpeng.mall.portal.config;

import online.pengpeng.mall.common.config.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * @author pengpeng
 * @date 2022/8/21
 */
@Configuration
@EnableCaching
public class RedisConfig extends BaseRedisConfig {
}
