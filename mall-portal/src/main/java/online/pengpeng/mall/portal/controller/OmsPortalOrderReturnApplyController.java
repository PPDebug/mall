package online.pengpeng.mall.portal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import online.pengpeng.mall.common.api.CommonResult;
import online.pengpeng.mall.portal.domain.OmsOrderReturnApplyParam;
import online.pengpeng.mall.portal.service.OmsPortalOrderReturnApplyService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengpeng
 * @date 2022/8/28
 */
@RestController
@Api(tags = "OmsPortalOrderReturnApplyController", description = "申请退货管理")
@RequestMapping("/returnApply")
@AllArgsConstructor
public class OmsPortalOrderReturnApplyController {
    private final OmsPortalOrderReturnApplyService returnApplyService;

    @ApiOperation("申请退货")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public CommonResult create(@RequestBody OmsOrderReturnApplyParam returnApply) {
        int count = returnApplyService.create(returnApply);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
