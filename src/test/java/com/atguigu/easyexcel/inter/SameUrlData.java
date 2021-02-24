package com.atguigu.easyexcel.inter;

import java.lang.annotation.*;

/**
 *  @Description: 自定义注解防止表单重复提交
 */
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SameUrlData {

}