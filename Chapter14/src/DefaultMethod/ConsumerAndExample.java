package DefaultMethod;

import java.util.function.Consumer;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class ConsumerAndExample {
  public static void main(String[] args) {
    Consumer<Member> consumerA = (m) -> {
      System.out.println("consumerA : " + m.getName());
    };

    Consumer<Member> consumerB = (m) -> {
      System.out.println("consumerB : " + m.getId());
    };

    Consumer<Member> consumerAB = consumerA.andThen(consumerB);
    consumerAB.accept((new Member("이성원", "jusk2", null)));
  }
}
