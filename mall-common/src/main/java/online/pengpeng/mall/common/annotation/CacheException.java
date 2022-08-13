package online.pengpeng.mall.common.annotation;

import java.lang.annotation.*;

/**
 * @author pengpeng
 * @date 2022/8/13
 * 自定义注解，有该注解的缓存方法会抛出异常
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
