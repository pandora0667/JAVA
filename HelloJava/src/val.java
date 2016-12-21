/**
 * Created by jusk2 on 2016-12-21.
 */
public class val {
  public static void main(String[] args) {
    char c1 = 'A';
    char c2 = 65;
    char c3 = '\u0041';

    char c4 = '가';
    char c5 = 44032;
    char c6 = '\uac00';

    int uniCode = c1;
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println(c6);
    System.out.println(uniCode);

    boolean result = false;
    if (result) {
      System.out.println("중지합니다.\n");
    } else {
      System.out.println("시작합니다. \n");
    }
  }
}
