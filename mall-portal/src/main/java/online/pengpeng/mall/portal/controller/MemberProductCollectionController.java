package online.pengpeng.mall.portal.controller;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import online.pengpeng.mall.common.api.CommonPage;
import online.pengpeng.mall.common.api.CommonResult;
import online.pengpeng.mall.portal.domain.MemberProductCollection;
import online.pengpeng.mall.portal.service.MemberCollectionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author pengpeng
 * @date 2022/8/22
 * 商品收藏管理
 */
@Controller
@Api(tags = "MemberCollectionController", description = "会员收藏管理")
@RequestMapping("/member/productCollection")
@AllArgsConstructor
public class MemberProductCollectionController {
    private final MemberCollectionService memberCollectionService;

    @ApiOperation("添加商品收藏")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@RequestBody MemberProductCollection productCollection) {
        int count = memberCollectionService.add(productCollection);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("删除收藏商品")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(Long productId) {
        int count = memberCollectionService.delete(productId);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("显示收藏列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<MemberProductCollection>> list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                                  @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        Page<MemberProductCollection> page = memberCollectionService.list(pageNum,pageSize);
        return CommonResult.success(CommonPage.restPage(page));
    }

    @ApiOperation("显示收藏商品详情")
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<MemberProductCollection> detail(@RequestParam Long productId) {
        MemberProductCollection memberProductCollection = memberCollectionService.detail(productId);
        return CommonResult.success(memberProductCollection);
    }

    @ApiOperation("清空收藏列表")
    @RequestMapping(value = "/clear", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult clear() {
        memberCollectionService.clear();
        return CommonResult.success(null);
    }


}
