package com.Default.Method;

/**
 * Created by jusk2 on 2017-01-17.
 */
public class DefaultMethodExample {
  public static void main(String[] args) {
    MyInterface myInterface1 = new MyClassA();
    myInterface1.method1();
    myInterface1.method2();

    System.out.println();

    MyInterface myInterface2 = new MyClassB();
    myInterface2.method1();
    myInterface2.method2();

  }
}
