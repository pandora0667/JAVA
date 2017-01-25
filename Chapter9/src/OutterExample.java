/**
 * Created by jusk2 on 2017-01-25.
 */
public class OutterExample {
  public static void main(String[] args) {
    Outter outter = new Outter();
    Outter.Nested nested = outter.new Nested();

    nested.print();
  }
}
