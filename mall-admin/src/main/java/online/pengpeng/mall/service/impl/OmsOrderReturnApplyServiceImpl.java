package online.pengpeng.mall.service.impl;

import com.github.pagehelper.PageHelper;
import lombok.AllArgsConstructor;
import online.pengpeng.mall.dao.OmsOrderReturnApplyDao;
import online.pengpeng.mall.dto.OmsOrderReturnApplyResult;
import online.pengpeng.mall.dto.OmsReturnApplyQueryParam;
import online.pengpeng.mall.dto.OmsUpdateStatusParam;
import online.pengpeng.mall.mapper.OmsCompanyAddressMapper;
import online.pengpeng.mall.mapper.OmsOrderReturnApplyMapper;
import online.pengpeng.mall.model.OmsOrderReturnApply;
import online.pengpeng.mall.model.OmsOrderReturnApplyExample;
import online.pengpeng.mall.service.OmsOrderReturnApplyService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/29
 */
@AllArgsConstructor
@Service
public class OmsOrderReturnApplyServiceImpl implements OmsOrderReturnApplyService {
    private final OmsOrderReturnApplyDao returnApplyDao;
    private final OmsOrderReturnApplyMapper returnApplyMapper;


    @Override
    public List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        return returnApplyDao.getList(queryParam);
    }

    @Override
    public int delete(List<Long> ids) {
        OmsOrderReturnApplyExample example = new OmsOrderReturnApplyExample();
        example.createCriteria().andIdIn(ids).andStatusEqualTo(3);
        return returnApplyMapper.deleteByExample(example);
    }

    @Override
    public int updateStatus(Long id, OmsUpdateStatusParam statusParam) {
        Integer status = statusParam.getStatus();
        OmsOrderReturnApply returnApply = new OmsOrderReturnApply();
        if(status.equals(1)){
            //确认退货
            returnApply.setId(id);
            returnApply.setStatus(1);
            returnApply.setReturnAmount(statusParam.getReturnAmount());
            returnApply.setCompanyAddressId(statusParam.getCompanyAddressId());
            returnApply.setHandleTime(new Date());
            returnApply.setHandleMan(statusParam.getHandleMan());
            returnApply.setHandleNote(statusParam.getHandleNote());
        }else if(status.equals(2)){
            //完成退货
            returnApply.setId(id);
            returnApply.setStatus(2);
            returnApply.setReceiveTime(new Date());
            returnApply.setReceiveMan(statusParam.getReceiveMan());
            returnApply.setReceiveNote(statusParam.getReceiveNote());
        }else if(status.equals(3)){
            //拒绝退货
            returnApply.setId(id);
            returnApply.setStatus(3);
            returnApply.setHandleTime(new Date());
            returnApply.setHandleMan(statusParam.getHandleMan());
            returnApply.setHandleNote(statusParam.getHandleNote());
        }else{
            return 0;
        }
        return returnApplyMapper.updateByPrimaryKeySelective(returnApply);
    }

    @Override
    public OmsOrderReturnApplyResult getItem(Long id) {
        return returnApplyDao.getDetail(id);
    }
}
