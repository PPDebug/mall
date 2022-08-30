package online.pengpeng.mall.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.pengpeng.mall.common.api.CommonResult;
import online.pengpeng.mall.service.MinioService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * MinIO对象存储管理
 *
 * @author pengpeng
 * @date 2022/8/29
 */
@AllArgsConstructor
@RestController
@Slf4j
@Api(tags = "MinioController", description = "MinIO对象存储管理")
@RequestMapping("/minio")
public class MinioController {
    private final MinioService minioService;


    @ApiOperation("文件上传")
    @PostMapping
    public CommonResult upload(@RequestPart("file") MultipartFile file) {
        return CommonResult.success(minioService.uploadFile(file));
    }

    @ApiOperation("文件删除")
    @DeleteMapping
    public CommonResult delete(@RequestParam("objectName") String objectName) {
        minioService.deleteFile(objectName);
        return CommonResult.success(null);
    }
}
