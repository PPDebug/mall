package online.pengpeng.mall.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import online.pengpeng.mall.common.api.CommonResult;
import online.pengpeng.mall.dto.OssCallbackResult;
import online.pengpeng.mall.dto.OssPolicyResult;
import online.pengpeng.mall.service.OssService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * oss相关操作
 *
 * @author pengpeng
 * @date 2022/8/30
 */
@RestController
@Api(tags = "OssController", description = "Oss管理")
@RequestMapping("/aliyun/oss")
@AllArgsConstructor
public class OssController {
    private final OssService ossService;

    @ApiOperation(value = "oss上传签名生成")
    @PostMapping("/policy")
    public CommonResult<OssPolicyResult> policy() {
        OssPolicyResult result = ossService.policy();
        return CommonResult.success(result);
    }

    @ApiOperation(value = "oss上传成功回调")
    @PostMapping("callback")
    public CommonResult<OssCallbackResult> callback(HttpServletRequest request) {
        OssCallbackResult ossCallbackResult = ossService.callback(request);
        return CommonResult.success(ossCallbackResult);
    }

}
