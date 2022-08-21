package online.pengpeng.mall.search.domain;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @author pengpeng
 * @date 2022/8/21
 * 搜索商品的属性信息
 */
@Data
public class EsProductAttributeValue implements Serializable {
    private static final Long serialVersionUID = 1L;

    private Long id;
    private Long productAttributeId;
    //属性值
    @Field(type = FieldType.Keyword)
    private String value;
    //属性参数：0->规格；1->参数
    private Integer type;
    //属性名称
    @Field(type=FieldType.Keyword)
    private String name;
}
