/**
 * Created by jusk2 on 2016-12-26.
 * Main String Array Argument
 */
public class MainStringArrayArgument {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("프로그램 사용법");
      System.out.println("Java MainStringArrayArgument num1, num2");
      System.exit(0); // 프로그램 강제 종료
    }
  // 입력값을 정수로 변환할 수 없는 경우 Number Format Exception 발생
    String strNum1 = args[0];
    String strNum2 = args[1];
    int num1 = Integer.parseInt(strNum1);
    int num2 = Integer.parseInt(strNum2);
    int result = num1 + num2;

    System.out.println(num1 +  " + " + num2 + " = " + result);
  }
}
