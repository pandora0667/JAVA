package System.Class;

/**
 * Created by jusk2 on 2017-02-02.
 */
public class StringChatAtExample {
  public static void main(String[] args) {
    String ssn = "940630-1001234";
    char sex = ssn.charAt(7);

    switch (sex) {
      case '1':
      case '3':
        System.out.println("남자 입니다.");
        break;
      case '2':
      case '4':
        System.out.println("여자 입니다.");
        break;
    }
  }
}
