package online.pengpeng.mall.search.domain;

import lombok.Data;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/21
 * 搜索商品的品牌名称，分类名称及属性
 */
@Data
public class EsProductRelatedInfo {
    private List<String> brandNames;
    private List<String> productCategoryNames;
    private List<ProductAttr>   productAttrs;
}
