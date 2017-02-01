package System.Class;

/**
 * Created by jusk2 on 2017-02-02.
 */
public class StringIndexOfExample {
  public static void main(String[] args) {
    String subject = "자바 프로그래밍";

    int location = subject.indexOf("프로그래밍");
    System.out.println(location);

    if (subject.indexOf("자바") != -1) {
      System.out.println("자바와 관련된 책이군요");
    } else
      System.out.println("자바와 관련이 없는 책이네요");
  }
}
