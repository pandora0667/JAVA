/**
 * Created by jusk2 on 2016-12-23.
 * for문을 이용하여 삼각형을 만드시오
 */
public class Exercise06 {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
