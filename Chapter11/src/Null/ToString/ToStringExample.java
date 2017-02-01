package Null.ToString;

import java.util.Objects;

/**
 * Created by jusk2 on 2017-02-01.
 */
public class ToStringExample {
  public static void main(String[] args) {
    String str1 = "이성원";
    String str2 = null;

    System.out.println(Objects.toString(str1));
    System.out.println(Objects.toString(str2));
    System.out.println(Objects.toString(str2, "이름이 없습니다."));

  }
}
