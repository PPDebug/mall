package online.pengpeng.mall.auth.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.pengpeng.mall.auth.domain.Oauth2TokenDto;
import online.pengpeng.mall.common.api.CommonResult;
import online.pengpeng.mall.common.constant.AuthConstant;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author pengpeng
 * @date 2022/8/18
 */
@Api(tags = "AuthController", description = "认证中心登录认证")
@RestController
@RequestMapping("/oauth")
@AllArgsConstructor
@Slf4j
public class AuthController {
    private TokenEndpoint tokenEndpoint;

    @ApiOperation("Oauth2获取token")
    @RequestMapping(value = "/token", method = RequestMethod.POST)
    public CommonResult<Oauth2TokenDto> postAccessToken(HttpServletRequest request,
                                                        @ApiParam("授权模式") @RequestParam String grant_type,
                                                        @ApiParam("Oauth2客户端ID") @RequestParam String client_id,
                                                        @ApiParam("Oauth2客户端秘钥") @RequestParam String client_secret,
                                                        @ApiParam("刷新token") @RequestParam(required = false) String refresh_token,
                                                        @ApiParam("登录用户名") @RequestParam(required = false) String username,
                                                        @ApiParam("登录密码") @RequestParam(required = false) String password) throws HttpRequestMethodNotSupportedException, HttpRequestMethodNotSupportedException {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("grant_type",grant_type);
        parameters.put("client_id",client_id);
        parameters.put("client_secret",client_secret);
        parameters.putIfAbsent("refresh_token",refresh_token);
        parameters.putIfAbsent("username",username);
        parameters.putIfAbsent("password",password);
        Principal userPrincipal = request.getUserPrincipal();
        OAuth2AccessToken oAuth2AccessToken = tokenEndpoint.postAccessToken(userPrincipal, parameters).getBody();
        Oauth2TokenDto oauth2TokenDto = Oauth2TokenDto.builder()
                .token(oAuth2AccessToken.getValue())
                .refreshToken(oAuth2AccessToken.getRefreshToken().getValue())
                .expiresIn(oAuth2AccessToken.getExpiresIn())
                .tokenHead(AuthConstant.JWT_TOKEN_PREFIX).build();

        log.info("oauth2Token is: {}", oAuth2AccessToken);
        return CommonResult.success(oauth2TokenDto);
    }

}
