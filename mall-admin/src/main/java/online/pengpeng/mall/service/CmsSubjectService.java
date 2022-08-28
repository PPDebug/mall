package online.pengpeng.mall.service;

import online.pengpeng.mall.model.CmsSubject;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/28
 * 商品专题管理
 */
public interface CmsSubjectService {
    /**
     * 查询所有专题
     */
    List<CmsSubject> listAll();

    /**
     * 分页查询专题
     */
    List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize);
}
