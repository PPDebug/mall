package online.pengpeng.mall.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author pengpeng
 * @date 2022/8/18
 * 开启RPC服务
 */
@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class RpcConfig {
}
