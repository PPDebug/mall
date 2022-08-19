package online.pengpeng.mall.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author pengpeng
 * @date 2022/8/18
 */
@SpringBootApplication(scanBasePackages = "online.pengpeng.mall")
@EnableFeignClients
@EnableDiscoveryClient
public class MallAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallAuthApplication.class, args);
    }
}
