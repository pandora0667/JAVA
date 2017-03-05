package StaticMethod;

import java.util.function.Predicate;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class PredicateIsEqualExample {
  public static void main(String[] args) {
    Predicate<String> predicate;

    predicate = Predicate.isEqual(null);
    System.out.println("null, null : " + predicate.test(null));

    predicate = Predicate.isEqual("JAVA8");
    System.out.println("JAVA8, null : " + predicate.test(null));

    predicate = Predicate.isEqual("JAVA8");
    System.out.println("JAVA8, JAVA8 : " + predicate.test("JAVA8"));

    predicate = Predicate.isEqual("JAVA7");
    System.out.println("JAVA7, JAVA8 : " + predicate.test("JAVA8"));
  }
}
