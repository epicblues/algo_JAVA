package com.practice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.DayOfWeek;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

  String name() default "myDefault"; // annotation은 default를 가질 수 있다.

  int[] nums() default {1, 2, 34, 5};

  DayOfWeek day() default DayOfWeek.THURSDAY;
}
