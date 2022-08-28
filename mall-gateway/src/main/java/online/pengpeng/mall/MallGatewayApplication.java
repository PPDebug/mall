package online.pengpeng.mall;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author pengpeng
 * @date 2022/8/19
 */
@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class MallGatewayApplication {

    public static void main(String[] args) {
        log.debug("spring starting");
        SpringApplication.run(MallGatewayApplication.class, args);
    }

}