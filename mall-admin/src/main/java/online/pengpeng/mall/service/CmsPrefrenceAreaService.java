package online.pengpeng.mall.service;

import online.pengpeng.mall.model.CmsPrefrenceArea;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/28
 * 商品优选管理
 */
public interface CmsPrefrenceAreaService {
    /**
     * 获取所有优选专区
     */
    List<CmsPrefrenceArea> listAll();
}
