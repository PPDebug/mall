package online.pengpeng.mall.service;

import online.pengpeng.mall.dto.OssCallbackResult;
import online.pengpeng.mall.dto.OssPolicyResult;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理
 *
 * @author pengpeng
 * @date 2022/8/30
 */
public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();
    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
