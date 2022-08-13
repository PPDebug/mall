package online.pengpeng.mall.common.exception;

import online.pengpeng.mall.common.api.IErrorCode;

/**
 * @author pengpeng
 * @date 2022/8/13
 * 断言处理类，用来抛出各种API异常
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
