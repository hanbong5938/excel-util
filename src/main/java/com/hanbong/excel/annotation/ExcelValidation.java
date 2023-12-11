package com.hanbong.excel.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelValidation {
  String message() default "Validation failed";

  int min() default 0;

  int max() default Integer.MAX_VALUE;

  String regex() default "";

  boolean enableBlank() default true;

  boolean nullAble() default true;
}
