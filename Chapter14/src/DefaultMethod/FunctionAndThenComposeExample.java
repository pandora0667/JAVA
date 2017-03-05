package DefaultMethod;

import java.util.function.Function;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class FunctionAndThenComposeExample {
  public static void main(String[] args) {
    Function<Member, Address> functionA;
    Function<Address, String> functionB;
    Function<Member, String> functionAB;
    String city;

    functionA = (m) -> m.getAddress();
    functionB = (a) -> a.getCity();

    functionAB = functionA.andThen(functionB);
    city = functionAB.apply(
        new Member("이성원", "jusk2", new Address("한국", "대전"))
    );
    System.out.println("거주도시 : " + city);

    functionAB = functionB.compose(functionA);
    city = functionAB.apply(
        new Member("이성원", "jusk2", new Address("한국", "대전"))
    );
    System.out.println("거주도시 : " + city);
  }
}
