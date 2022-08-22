package online.pengpeng.mall.portal.service;

import online.pengpeng.mall.portal.domain.MemberProductCollection;
import org.springframework.data.domain.Page;

/**
 * @author pengpeng
 * @date 2022/8/22
 */
public interface MemberCollectionService {
    int add(MemberProductCollection productCollection);

    int delete(Long productId);

    Page<MemberProductCollection> list(Integer pageNum, Integer pageSize);

    MemberProductCollection detail(Long productId);

    void clear();
}
