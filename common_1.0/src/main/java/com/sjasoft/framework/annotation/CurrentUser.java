package com.sjasoft.framework.annotation;

import java.lang.annotation.*;

/**
 * 当前用户
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CurrentUser {
}