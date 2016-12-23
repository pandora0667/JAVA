/**
 * Created by jusk2 on 2016-12-23.
 * Switch String Example
 */
public class SwitchStringExample {
  public static void main(String[] args) {
    String position = "부장";

    switch (position) {
      case "부장" :
        System.out.println("700만원");
        break;
      case "과장" :
        System.out.println("500만원");
        break;
      default:
        System.out.println("300만원");
    }
  }
}
