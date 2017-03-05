package Supplier;

import java.util.function.IntSupplier;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class SupplierExample {
  public static void main(String[] args) {
    IntSupplier intSupplier = () -> {
      int num = (int) (Math.random() * 6) + 1;
      return num;
    };

    int num = intSupplier.getAsInt();
    System.out.println("눈의 수 : " + num);
  }
}
