package Chapter11.Example;

/**
 * Created by jusk2 on 2017-02-11.
 */
public class StringBuilderExample {
  public static void main(String[] args) {
    String str = "";
    for (int i=0; i<100; i++)
      str += i;
    System.out.println(str);

    System.out.println();

    // 개선코드 작성위치
    StringBuilder sb = new StringBuilder();

    for (int i=0; i<100; i++)
      sb.append(i);
    System.out.println(sb.toString());

  }
}
