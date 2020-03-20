package com.kernel.log.annotation;

import java.lang.annotation.*;

/**
 * @author kndopensource
 * @date 2020/20/3
 *
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuditLog {
    /**
     * 操作信息
     */
    String operation();

}
