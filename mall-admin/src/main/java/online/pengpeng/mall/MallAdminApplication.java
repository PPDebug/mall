package online.pengpeng.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author pengpeng
 * @date 2022/8/14
 * 应用启动入口
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class MallAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallAdminApplication.class, args);
    }
}
