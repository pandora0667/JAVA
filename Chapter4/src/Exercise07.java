import java.util.Scanner;
/**
 * Created by jusk2 on 2016-12-23.
 * 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 코드 작성
 */
public class Exercise07 {
  public static void main(String[] args) {
    int balance = 0; // 통장 잔고

    boolean run = true;
    Scanner scanner = new Scanner(System.in);
    //int select = scanner.nextInt();

   Outter : while (run) {
      System.out.println("----------------------------------");
      System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
      System.out.println("----------------------------------");
      System.out.print("선택 >");
      int select = scanner.nextInt();

      switch (select) {
        case 1:
          System.out.print("예금액 > ");
          int deposit = scanner.nextInt();
          balance += deposit;
          break;
        case 2:
          System.out.print("출금액 > ");
          int withdraw = scanner.nextInt();
          balance -= withdraw;
          break;
        case 3:
          System.out.println("잔고 > " + balance);
          break;
        case 4:
          break Outter;
        default:
          System.out.println("다시 입력하세요");
      }
    }
  }
}
