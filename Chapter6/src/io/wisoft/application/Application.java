package io.wisoft.application;

/**
 * Created by jusk2 on 2017-01-04.
 */

import com.hanbat.application.*;

public class Application {
  public static void main(String[] args) {
    System.out.println("애플리케이션을 실행합니다. ");
    System.out.println();

    print hello = new print();
    hello.print();

  }
}

