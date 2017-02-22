package BoundedType;

/**
 * Created by jusk2 on 2017-02-22.
 */
public class BoundedTypeParameterExample {
  public static void main(String[] args) {
    int result1 = Util.compare(10, 20);
    System.out.println(result1);

    int result2 = Util.compare(4.5, 3);
    System.out.println(result2);

    int result3 = Util.compare(7.5, 7.5);
    System.out.println(result3);

//    String str = Util.compare("APPLE", "MAC");
//    System.out.println(str);
//    String은 Number 타입이 아님
  }
}
