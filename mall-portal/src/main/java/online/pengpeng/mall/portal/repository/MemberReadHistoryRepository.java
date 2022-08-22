package online.pengpeng.mall.portal.repository;

import online.pengpeng.mall.portal.domain.MemberReadHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author pengpeng
 * @date 2022/8/22
 * 用户商品浏览历史
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory, String> {
    Page<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId, Pageable pageable);
    void deleteAllByMemberId(Long memberId);
}
