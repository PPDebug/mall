package online.pengpeng.mall.auth.service.impl;

import lombok.AllArgsConstructor;
import online.pengpeng.mall.auth.constant.MessageConstant;
import online.pengpeng.mall.auth.domain.SecurityUser;
import online.pengpeng.mall.auth.service.UmsAdminService;
import online.pengpeng.mall.auth.service.UmsMemberService;
import online.pengpeng.mall.common.constant.AuthConstant;
import online.pengpeng.mall.common.domain.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.handler.MessageContext;

/**
 * @author pengpeng
 * @date 2022/8/18
 */
@Service
@AllArgsConstructor
public class UserServiceIml implements UserDetailsService {
    private final UmsAdminService adminService;
    private final UmsMemberService memberService;
    private final HttpServletRequest request;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String clientId = request.getParameter("client_id");
        UserDto userDto;
        if (AuthConstant.ADMIN_CLIENT_ID.equals(clientId)) {
            userDto = adminService.loadUserBuUsername(username);
        } else {
            userDto = memberService.loadUserBuUsername(username);
        }
        if (userDto == null) {
            throw new UsernameNotFoundException(MessageConstant.USERNAME_PASSWORD_ERROR);
        }

        userDto.setClientId(clientId);
        SecurityUser securityUser = new SecurityUser(userDto);
        if (!securityUser.isEnabled()) {
            throw new DisabledException(MessageConstant.ACCOUNT_DISABLED);
        } else if (!securityUser.isAccountNonLocked()) {
            throw new LockedException(MessageConstant.ACCOUNT_LOCKED);
        } else if (!securityUser.isAccountNonExpired()) {
            throw new AccountExpiredException(MessageConstant.ACCOUNT_EXPIRED);
        } else if (!securityUser.isCredentialsNonExpired()) {
            throw new CredentialsExpiredException(MessageConstant.CREDENTIALS_EXPIRED);
        }
        return securityUser;
    }
}
