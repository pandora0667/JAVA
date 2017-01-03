/**
 * Created by jusk2 on 2017-01-04.
 */
public class KoreanExample {
  public static void main(String[] args) {

    Korean K1 = new Korean("이성원", "940630-1******");
    System.out.println("K1.name : " + K1.name);
    System.out.println("K1.ssn : " + K1.ssn );
    System.out.println(K1.nation);

    System.out.println();

    Korean K2 = new Korean("이소원", "990820-2******");
    System.out.println("K2.name : " + K2.name);
    System.out.println("K2.ssn : " + K2.ssn);
    System.out.println(K2.nation);
  }
}
