package online.pengpeng.mall.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author pengpeng
 * @date 2022/8/21
 */
@SpringBootApplication(scanBasePackages = "online.pengpeng.mall")
@EnableDiscoveryClient
public class MallSearchApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallSearchApplication.class, args);
    }
}
