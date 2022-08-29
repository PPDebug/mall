package online.pengpeng.mall.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import online.pengpeng.mall.common.api.CommonResult;
import online.pengpeng.mall.model.CmsPrefrenceArea;
import online.pengpeng.mall.service.CmsPreferenceAreaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/28
 * 商品优选管理
 */
@RestController
@Api(tags = "CmsPreferenceAreaController", description = "商品优选管理")
@RequestMapping("/prefrenceArea")
@AllArgsConstructor
public class CmsPreferenceAreaController {
    private final CmsPreferenceAreaService preferenceAreaService;

    @ApiOperation("获取所有商品优选")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    public CommonResult<List<CmsPrefrenceArea>> listAll() {
        List<CmsPrefrenceArea> preferenceAreaList = preferenceAreaService.listAll();
        return CommonResult.success(preferenceAreaList);
    }
}
