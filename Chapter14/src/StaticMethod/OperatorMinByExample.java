package StaticMethod;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class OperatorMinByExample {
  public static void main(String[] args) {
    BinaryOperator<Fruit> binaryOperator;
    Fruit fruit;

    binaryOperator = BinaryOperator.minBy(Comparator.comparingInt(Fruit::price));
    fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
    System.out.println(fruit.name());

    binaryOperator = BinaryOperator.maxBy(Comparator.comparingInt(Fruit::price));
    fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
    System.out.println(fruit.name());


  }
}
