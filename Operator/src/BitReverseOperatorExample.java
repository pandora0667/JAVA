/**
 * Created by jusk2 on 2016-12-21.
 * bit Reverse Operator Example
 */
public class BitReverseOperatorExample {
  public static void main(String[] args) {
    int v1 = 10, v2 = ~v1, v3 = ~v1 + 1;

    System.out.println(toBinaryString(v1) + "(10진수 : " + v1 + ")");
    System.out.println(toBinaryString(v2) + "(10진수 : " + v2 + ")");
    System.out.println(toBinaryString(v3) + "(10진수 : " + v3 + ")");
    System.out.println();

    int v4 = -10, v5 = ~v4, v6 = ~v4 +1;
    System.out.println(toBinaryString(v4) + "(10진수 : " + v4 + ")");
    System.out.println(toBinaryString(v5) + "(10진수 : " + v5 + ")");
    System.out.println(toBinaryString(v6) + "(10진수 : " + v6 + ")");
  }

  public static String toBinaryString(int value)
  {
    String str = Integer.toBinaryString(value);
    while(str.length() < 32)
      str = "0" + str; // 결합 32비트 맞춰줌 ;
    return str;
  }
}
