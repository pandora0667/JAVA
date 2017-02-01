package System.Class;

/**
 * Created by jusk2 on 2017-02-02.
 */
public class StringRepalceExample {
  public static void main(String[] args) {
    String ssn = "940630-1000000";
    String firstNum = ssn.substring(0,6);
    System.out.println(firstNum);

    String secondNum = ssn.substring(7);
    System.out.println(secondNum);
  }
}
