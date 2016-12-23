/**
 * Created by jusk2 on 2016-12-23.
 * Continue Example
 */
public class ContinueExample {
  public static void main(String[] args) {
    for (int i=1; i<=10; i++) {
      if (i % 2 != 1)
        continue;
      System.out.print(i + ", ");
    }
  }
}
