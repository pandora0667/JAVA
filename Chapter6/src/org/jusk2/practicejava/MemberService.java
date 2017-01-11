package org.jusk2.practicejava;

import java.util.Scanner;

/**
 * Created by jusk2 on 2017-01-11.
 */
public class MemberService {
  public static void main(String[] args) {

    Member user1 = new Member("홍길동", "hong");
    Scanner scanner = new Scanner(System.in);

    System.out.println("ID와 Password 입력");
    String id = scanner.nextLine();
    String password = scanner.nextLine();

    System.out.println("결과값은 " + user1.compare(id, password) + " 입니다.");

    Member user2 = new Member();

    System.out.println("ID와 Password 입력");
    id = scanner.nextLine();
    password = scanner.nextLine();

    user2.login("Lee", "12345");
    boolean result = user2.compare(id, password);

    if (result) {
      System.out.println("로그인이 되었습니다.");
    } else {
      System.out.println("ID와 Password가 올바르지 않습니다.");
    }
  }
}
