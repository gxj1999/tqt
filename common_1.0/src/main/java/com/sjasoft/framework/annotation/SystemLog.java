package com.sjasoft.framework.annotation;

import java.lang.annotation.*;

/**
 * 系统日志
 * @author simon
 *
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemLog {

    String value() default "";

}
