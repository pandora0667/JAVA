package Chapter11.Example;

/**
 * Created by jusk2 on 2017-02-11.
 */
public class IntegerCompareExample {
  public static void main(String[] args) {
    Integer obj1 = 100;
    Integer obj2 = 100;
    Integer obj3 = 300;
    Integer obj4 = 300;

    System.out.println(obj1 == obj2);
    System.out.println(obj3 == obj4);
    System.out.println(obj3.intValue() == obj4.intValue());

  }
}
