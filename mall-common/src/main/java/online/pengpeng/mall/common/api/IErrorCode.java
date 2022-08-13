package online.pengpeng.mall.common.api;

/**
 * @author pengpeng
 * @date 2022/8/13
 * 封装API的错误码
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}