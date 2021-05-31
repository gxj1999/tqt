package com.sjasoft.framework.annotation;

import java.lang.annotation.*;

/**
 * 忽略验证
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreSecurity {
}