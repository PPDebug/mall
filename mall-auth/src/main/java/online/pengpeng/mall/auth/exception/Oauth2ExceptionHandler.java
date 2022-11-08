package online.pengpeng.mall.auth.exception;

import lombok.extern.slf4j.Slf4j;
import online.pengpeng.mall.common.api.CommonResult;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author pengpeng
 * @date 2022/8/18
 * 全局处理Oauth2抛出的异常
 */
@ControllerAdvice
@Slf4j
public class Oauth2ExceptionHandler {
    @ResponseBody
    @ExceptionHandler(value = OAuth2Exception.class)
    public CommonResult handleOauth2(OAuth2Exception e) {
        log.info("OAuth2Exception: {}", e.getMessage());
        return CommonResult.failed(e.getMessage());
    }
}
