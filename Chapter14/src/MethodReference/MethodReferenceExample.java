package MethodReference;

import java.util.function.IntBinaryOperator;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class MethodReferenceExample {
  public static void main(String[] args) {
    IntBinaryOperator operator;

    // 정적 메소드 참조
    operator = (x, y) -> Calaulator.staticMethod(x, y);
    System.out.println("결과 1 : " + operator.applyAsInt(1, 2));

    operator = Calaulator :: staticMethod;
    System.out.println("결과 1 : " + operator.applyAsInt(3, 4));

    // 인스턴스 메소드 참조
    Calaulator obj = new Calaulator();
    operator = (x, y) -> obj.instanceMethod(x, y);
    System.out.println("결과 1 : " + operator.applyAsInt(5, 6));

    operator = obj :: instanceMethod;
    System.out.println("결과 1 : " + operator.applyAsInt(7, 8));
  }
}
