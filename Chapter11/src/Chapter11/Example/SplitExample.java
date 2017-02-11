package Chapter11.Example;

import java.util.StringTokenizer;

/**
 * Created by jusk2 on 2017-02-11.
 */
public class SplitExample {
  public static void main(String[] args) {
    String str = "아이디,이름,패스워드";

    // Split 사용
    String[] strSplit = str.split(",");
    for (String split : strSplit) {
      System.out.println(split);
    }

    System.out.println();

    // StringTokenizer 사용
    StringTokenizer tokenSplit = new StringTokenizer(str, ",");
    while (tokenSplit.hasMoreTokens()) {
      String token = tokenSplit.nextToken();
      System.out.println(token);
    }

  }
}
