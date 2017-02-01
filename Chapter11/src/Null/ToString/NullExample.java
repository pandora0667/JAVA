package Null.ToString;

import java.util.Objects;

/**
 * Created by jusk2 on 2017-02-01.
 */
public class NullExample {
  public static void main(String[] args) {
    String str1 = "이성원";
    String str2 = null;

    System.out.println(Objects.requireNonNull(str1));

    try {
      String name = Objects.requireNonNull(str2);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      String name = Objects.requireNonNull(str2, "이름이 없습니다.");
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }

    try {
      String name = Objects.requireNonNull(str2, ()->"이름이 없다니깐요!!"); // 람다식
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
