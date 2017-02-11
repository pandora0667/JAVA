package Wrapper;

/**
 * Created by jusk2 on 2017-02-02.
 */
public class BoxingUnBoxingExample {
  public static void main(String[] args) {
    //Boxing
    Integer obj1 = new Integer(100);
    Integer obj2 = new Integer(200);
    Integer obj3 = Integer.valueOf("300");

    //Unboxing
    int value1 = obj1.intValue();
    int value2 = obj2.intValue();
    int value3 = obj3.intValue();

    System.out.println(value1 + ", " + value2 + ", " + value3);

    //자동 Boxing
    Integer obj4 = 500;
    System.out.println("자동 Boxing : " + obj4.intValue());

    //자동 UnBoxing
    int value4 = obj4;
    System.out.println("자동 UnBoxing : " + value4);

    //연산시 자동 UnBoxing
    int result = obj4 + 100;
    System.out.println("연산시 자동 UnBoxing : " + result);

  }
}
