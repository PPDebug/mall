package online.pengpeng.mall.service;

import online.pengpeng.mall.dto.SmsFlashPromotionSessionDetail;
import online.pengpeng.mall.model.SmsFlashPromotionSession;

import java.util.List;

/**
 * 显示购买具体场次时间段管理
 * @author pengpeng
 * @date 2022/8/29
 */
public interface SmsFlashPromotionSessionService {
    /**
     * 添加场次
     */
    int create(SmsFlashPromotionSession promotionSession);

    /**
     * 修改场次
     */
    int update(Long id, SmsFlashPromotionSession promotionSession);

    /**
     * 修改场次启用状态
     */
    int updateStatus(Long id, Integer status);

    /**
     * 删除场次
     */
    int delete(Long id);

    /**
     * 获取详情
     */
    SmsFlashPromotionSession getItem(Long id);

    /**
     * 根据启用状态获取场次列表
     */
    List<SmsFlashPromotionSession> list();

    /**
     * 获取某个显示购买活动可选场次及其数量
     */
    List<SmsFlashPromotionSessionDetail> selectList(Long flashPromotionId);
}
