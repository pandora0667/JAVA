package com.Default.Method;

/**
 * Created by jusk2 on 2017-01-17.
 */
public class MyClassB implements MyInterface {
  @Override
  public void method1() {
    System.out.println("MyclassB - method1() 실행");
  }

  @Override
  public void method2() { //default 메소드 재정의
    System.out.println("MyClassB - method2() 실행");
  }
}
