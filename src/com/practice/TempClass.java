package com.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

@MyAnnotation(name = "hello", nums = {59, 4, 2, 3})
public class TempClass {

  public int myData = 4;

  public void checkMyMetadata()
      throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, NoSuchFieldException {
    MyAnnotation myAnnotation = this.getClass()
        .getAnnotation(MyAnnotation.class); // 해당 클래스를 감싸고 있는 annotation '인스턴스'

    Class<? extends MyAnnotation> myAnnotationType = myAnnotation.getClass(); // TempClass용 MyAnnotation '하위 타입' (name = "hello", nums = {59,4,2,3});

    Arrays.stream(myAnnotationType.getDeclaredMethods()).iterator().forEachRemaining(method -> {
      try {
        method.setAccessible(true);

        if (method.getParameterTypes().length > 0) {
          return;
        }

        System.out.println(method.getName() + " : " + method.invoke(myAnnotation));
        // TempClass용 Annotation에 대한 정보
//        name : hello
//        toString : @com.practice.MyAnnotation(name="hello", day=THURSDAY, nums={59, 4, 2, 3})
//        hashCode : 1993880378
//        annotationType : interface com.practice.MyAnnotation
//        day : THURSDAY
//        nums : [I@573f2bb1
      } catch (Exception e) {
        e.printStackTrace();
      }
    });

    System.out.println(myAnnotation.day());

    Constructor[] construct = this.getClass().getDeclaredConstructors();
    Method[] methods = this.getClass().getDeclaredMethods();
    for (Constructor constructed : construct) {
      constructed.newInstance();
    }
    for (Method method : methods) {
      if (!method.getName().contains("checkMyMetadata")) {
        System.out.println(method.getName());
        method.invoke(this);
      } else {
        System.out.println("checkMyMetadata also called");
      }
    }

    System.out.println("필드 값 변경, 이전 필드 값 : " + this.myData);

    this.getClass().getField("myData").set(this, 24444);

    System.out.println("이후 필드 값 : " + this.myData);

  }

  public void otherMethod() {
    System.out.println("otherMethod called!");
  }

}
