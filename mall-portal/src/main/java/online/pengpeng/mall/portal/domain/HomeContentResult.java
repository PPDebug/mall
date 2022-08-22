package online.pengpeng.mall.portal.domain;

import lombok.Data;
import online.pengpeng.mall.model.CmsSubject;
import online.pengpeng.mall.model.PmsBrand;
import online.pengpeng.mall.model.PmsProduct;
import online.pengpeng.mall.model.SmsHomeAdvertise;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/22
 * 首页内容返回信息封装
 */
@Data
public class HomeContentResult {
    //轮播广告
    private List<SmsHomeAdvertise> advertiseList;
    //推荐品牌
    private List<PmsBrand> brandList;
    //当前秒杀场次
    private HomeFlashPromotion homeFlashPromotion;
    //新品推荐
    private List<PmsProduct> newProductList;
    //人气推荐
    private List<PmsProduct> hotProductList;
    //推荐专题
    private List<CmsSubject> subjectList;
}
