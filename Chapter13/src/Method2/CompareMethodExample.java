package Method2;

/**
 * Created by jusk2 on 2017-02-22.
 */
public class CompareMethodExample {
  public static void main(String[] args) {
    Pair<Integer, String> p1 = new Pair<>(1, "APPLE");
    Pair<Integer, String> p2 = new Pair<>(1, "APPLE");
    boolean result1 = Util.compare(p1, p2); // <Integer, String>compare(p1, p2); 구체적 타입 명시적 지정방법

    if (result1) {
      System.out.println("논리적으로 동등한 객체 입니다.");
    } else {
      System.out.println("논리적으로 동등하지 않는 객체입니다.");
    }

    Pair<String, String> p3 = new Pair<>("APPLE", "MacBOOK");
    Pair<String, String> p4 = new Pair<>("APPLE", "iPad");
    boolean result2 = Util.compare(p3, p4);

    if (result2) {
      System.out.println("논리적으로 동등한 객체 입니다.");
    } else {
      System.out.println("논리적으로 동등하지 않는 객체입니다.");
    }
  }
}
