package System.Class;

/**
 * Created by jusk2 on 2017-02-02.
 */
public class StringSplitExample {
  public static void main(String[] args) {
    String text = "이성원&안덕기, 김남준, 최선호,서보민-이근혁";

    String[] names = text.split("&|, |-|,");

    for (String name : names)
      System.out.println(name);
  }
}
