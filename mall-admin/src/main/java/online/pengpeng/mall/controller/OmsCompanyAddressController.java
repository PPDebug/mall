package online.pengpeng.mall.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import online.pengpeng.mall.common.api.CommonResult;
import online.pengpeng.mall.model.OmsCompanyAddress;
import online.pengpeng.mall.service.OmsCompanyAddressService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商城收货地址管理
 *
 * @author pengpeng
 * @date 2022/8/29
 */
@AllArgsConstructor
@RestController
@Api(tags = "OmsCompanyAddressController", description = "收货地址管理")
@RequestMapping("/companyAddress")
public class OmsCompanyAddressController {
    private final OmsCompanyAddressService companyAddressService;

    @ApiOperation("获取所有收货地址")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public CommonResult<List<OmsCompanyAddress>> list() {
        List<OmsCompanyAddress> companyAddressList = companyAddressService.list();
        return CommonResult.success(companyAddressList);
    }
}
