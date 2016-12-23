import java.util.Scanner;

/**
 * Created by jusk2 on 2016-12-23.
 * Do While Example
 */
public class DoWhileExample {
  public static void main(String[] args) {
    System.out.println("메시지를 입력하세요");
    System.out.println("프로그램을 종료하려면 q를 누르세요");

    Scanner scanner = new Scanner(System.in); // Scanner 객체생성
    String inputString;

    do {
      System.out.print(">");
      inputString = scanner.nextLine(); // 키보드로 입력한 문자열을 얻음
      System.out.println(inputString);
    } while (! inputString.equals("q"));

    System.out.println();
    System.out.println("프로그램 종료");
  }
}
