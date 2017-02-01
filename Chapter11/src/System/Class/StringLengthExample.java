package System.Class;

/**
 * Created by jusk2 on 2017-02-02.
 */
public class StringLengthExample {
  public static void main(String[] args) {
    String ssn = "9406301000000";

    int length = ssn.length();
    if (length == 13) {
      System.out.println("주민번로 자리수가 맞습니다.");
    } else
      System.out.println("주민번로 자리수가 틀립니다.");
  }
}
