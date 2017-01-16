package com.Default.Method;

/**
 * Created by jusk2 on 2017-01-17.
 */
public interface MyInterface {
  public void method1();

  public default void method2() { // default 메소드
    System.out.println("MyInterface - method2 실행");
  }
}
