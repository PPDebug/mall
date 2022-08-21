package online.pengpeng.mall.search.domain;

import lombok.Data;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/21
 */
@Data
public class ProductAttr {
    private Long attrId;
    private String attrName;
    private List<String> attrValues;
}
