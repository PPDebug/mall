package online.pengpeng.mall.service.impl;

import com.github.pagehelper.PageHelper;
import lombok.AllArgsConstructor;
import online.pengpeng.mall.dao.SmsCouponDao;
import online.pengpeng.mall.dao.SmsCouponProductCategoryRelationDao;
import online.pengpeng.mall.dao.SmsCouponProductRelationDao;
import online.pengpeng.mall.mapper.SmsCouponHistoryMapper;
import online.pengpeng.mall.mapper.SmsCouponMapper;
import online.pengpeng.mall.mapper.SmsCouponProductCategoryRelationMapper;
import online.pengpeng.mall.mapper.SmsCouponProductRelationMapper;
import online.pengpeng.mall.model.SmsCouponHistory;
import online.pengpeng.mall.model.SmsCouponHistoryExample;
import online.pengpeng.mall.service.SmsCouponHistoryService;
import org.simpleframework.xml.Version;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/29
 */
@Service
@AllArgsConstructor
public class SmsCouponHistoryServiceImpl implements SmsCouponHistoryService {
    private final SmsCouponHistoryMapper historyMapper;

    @Override
    public List<SmsCouponHistory> list(Long couponId, Integer useStatus, String orderSn, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        SmsCouponHistoryExample example = new SmsCouponHistoryExample();
        SmsCouponHistoryExample.Criteria criteria = example.createCriteria();
        if(couponId!=null){
            criteria.andCouponIdEqualTo(couponId);
        }
        if(useStatus!=null){
            criteria.andUseStatusEqualTo(useStatus);
        }
        if(!StringUtils.isEmpty(orderSn)){
            criteria.andOrderSnEqualTo(orderSn);
        }
        return historyMapper.selectByExample(example);
    }

}
