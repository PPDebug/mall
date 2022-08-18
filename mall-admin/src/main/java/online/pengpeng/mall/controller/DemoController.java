package online.pengpeng.mall.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengpeng
 * @date 2022/8/14
 */
@Api(tags = "value")
@RestController
public class DemoController {
    @GetMapping("/demo")
    public String demo() {
        return "Hello world";
    }
}
