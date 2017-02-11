package Chapter11.Example;

import java.util.regex.Pattern;

/**
 * Created by jusk2 on 2017-02-11.
 */
public class PatternMacherExample {
  public static void main(String[] args) {
    String id = "Angel1004";
    String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
    boolean isMatch = Pattern.matches(regExp, id);

    if (isMatch)
      System.out.println("ID로 사용할 수 있습니다.");
    else
      System.out.println("ID로 사용할 수 없습니다.");
  }
}
