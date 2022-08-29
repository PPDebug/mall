package online.pengpeng.mall.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import online.pengpeng.mall.common.api.CommonPage;
import online.pengpeng.mall.common.api.CommonResult;
import online.pengpeng.mall.dto.*;
import online.pengpeng.mall.model.OmsOrderReturnApply;
import online.pengpeng.mall.model.OmsOrderSetting;
import online.pengpeng.mall.service.OmsOrderReturnApplyService;
import online.pengpeng.mall.service.OmsOrderSettingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 订单设置（订单失效时间、默认收货时间等）
 *
 * @author pengpeng
 * @date 2022/8/29
 */
@AllArgsConstructor
@RestController
@Api(tags = "OmsOrderSettingController", description = "订单设置管理")
@RequestMapping("/orderSetting")
public class OmsOrderSettingController {
    private OmsOrderSettingService orderSettingService;

    @ApiOperation("获取指定订单设置")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<OmsOrderSetting> getItem(@PathVariable Long id) {
        OmsOrderSetting orderSetting = orderSettingService.getItem(id);
        return CommonResult.success(orderSetting);
    }

    @ApiOperation("修改指定订单设置")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable Long id, @RequestBody OmsOrderSetting orderSetting) {
        int count = orderSettingService.update(id,orderSetting);
        if(count>0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
