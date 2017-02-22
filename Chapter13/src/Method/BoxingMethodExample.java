package Method;

/**
 * Created by jusk2 on 2017-02-22.
 */
public class BoxingMethodExample {
  public static void main(String[] args) {
    Box<Integer> box1 = Util.boxing(100); // Util.<Integer>boxing(100); 명시적인 호출 방법
    int intValue = box1.get();

    Box<String> box2 = Util.boxing("이성원");
    String strValue = box2.get();

    System.out.println(intValue + ", " + strValue);
  }
}
