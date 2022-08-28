package online.pengpeng.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/28
 * 后台子菜单节点封装
 */
@Data
public class UmsMenuNode {
    @ApiModelProperty(value = "子级菜单")
    private List<UmsMenuNode> children;
}
