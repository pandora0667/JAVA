/**
 * Created by jusk2 on 2016-12-22.
 * String Equals Example
 */
public class StringEqualsExample {
  public static void main(String[] args) {
    String strVal1 = "이성원";
    String strVal2 = "이성원";
    String strVal3 = new String("이성원");

    System.out.println(strVal1 == strVal2);
    System.out.println(strVal1 == strVal3);
    System.out.println();
    System.out.println(strVal1.equals(strVal2)); // 순수한 문자열 사용시 Equals 사용
    System.out.println(strVal3.equals(strVal1));
  }
}