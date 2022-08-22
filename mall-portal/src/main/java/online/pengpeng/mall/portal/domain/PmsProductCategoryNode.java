package online.pengpeng.mall.portal.domain;

import lombok.Data;
import online.pengpeng.mall.model.PmsProductCategory;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/22
 * 商品分类、包含子分类
 */
@Data
public class PmsProductCategoryNode extends PmsProductCategory {
    private List<PmsProductCategoryNode> children;
}
