package online.pengpeng.mall.conponent;

import lombok.AllArgsConstructor;
import online.pengpeng.mall.service.UmsResourceService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author pengpeng
 * @date 2022/8/28
 * 资源与角色访问对应关系操作组件
 */
@Component
@AllArgsConstructor
public class ResourceRoleRulesHolder {

    private UmsResourceService resourceService;

    @PostConstruct
    public void initResourceRolesMap(){
        resourceService.initResourceRolesMap();
    }
}
