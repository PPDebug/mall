package online.pengpeng.mall.portal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import online.pengpeng.mall.common.api.CommonPage;
import online.pengpeng.mall.common.api.CommonResult;
import online.pengpeng.mall.model.PmsBrand;
import online.pengpeng.mall.model.PmsProduct;
import online.pengpeng.mall.portal.service.PortalBrandService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/22
 * 首页品牌推荐管理
 */
@Controller
@Api(tags = "PortalBrandController", description = "前台品牌管理")
@RequestMapping("/brand")
@AllArgsConstructor
public class PortalBrandController {
    private final PortalBrandService homeBrandService;

    @ApiOperation("分页获取推荐品牌")
    @RequestMapping(value = "/recommendList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsBrand>> recommendList(@RequestParam(value = "pageSize", defaultValue = "6") Integer pageSize,
                                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<PmsBrand> brandList = homeBrandService.recommendList(pageNum, pageSize);
        return CommonResult.success(brandList);
    }

    @ApiOperation("获取品牌详情")
    @RequestMapping(value = "/detail/{brandId}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PmsBrand> detail(@PathVariable Long brandId) {
        PmsBrand brand = homeBrandService.detail(brandId);
        return CommonResult.success(brand);
    }

    @ApiOperation("分页获取品牌相关商品")
    @RequestMapping(value = "/productList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsProduct>> productList(@RequestParam Long brandId,
                                                            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                            @RequestParam(value = "pageSize", defaultValue = "6") Integer pageSize) {
        CommonPage<PmsProduct> result = homeBrandService.productList(brandId,pageNum, pageSize);
        return CommonResult.success(result);
    }
}
