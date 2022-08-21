package online.pengpeng.mall.common.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/18
 * 用户登录信息
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String password;
    private String username;
    private Integer status;
    private String clientId;
    private List<String> roles;
}
