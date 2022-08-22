package online.pengpeng.mall.portal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import online.pengpeng.mall.common.api.CommonPage;
import online.pengpeng.mall.common.api.CommonResult;
import online.pengpeng.mall.portal.domain.MemberReadHistory;
import online.pengpeng.mall.portal.service.MemberReadHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author pengpeng
 * @date 2022/8/22
 * 用户商品浏览记录管理
 */
@Controller
@Api(tags = "MemberReadHistoryController", description = "会员商品浏览记录管理")
@RequestMapping("/member/readHistory")
@AllArgsConstructor
public class MemberReadHistoryController {
    private final MemberReadHistoryService memberReadHistoryService;

    @ApiOperation("创建浏览记录")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody MemberReadHistory memberReadHistory) {
        int count = memberReadHistoryService.create(memberReadHistory);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("删除浏览记录")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@RequestParam("ids") List<String> ids) {
        int count = memberReadHistoryService.delete(ids);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("清空除浏览记录")
    @RequestMapping(value = "/clear", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult clear() {
        memberReadHistoryService.clear();
        return CommonResult.success(null);
    }

    @ApiOperation("分页获取用户浏览记录")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<MemberReadHistory>> list(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                            @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        Page<MemberReadHistory> page = memberReadHistoryService.list(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(page));
    }

}
