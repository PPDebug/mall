package online.pengpeng.mall.auth.service;

import online.pengpeng.mall.common.domain.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author pengpeng
 * @date 2022/8/18
 */
@FeignClient("mall-portal")
public interface UmsMemberService {
    @GetMapping("/sso/loadByUsername")
    UserDto loadUserBuUsername(@RequestParam String username);
}
