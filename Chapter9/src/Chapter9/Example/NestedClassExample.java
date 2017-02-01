package Chapter9.Example;

/**
 * Created by jusk2 on 2017-02-01.
 */
public class NestedClassExample {
  public static void main(String[] args) {
    Car myCar = new Car();

    Car.Tire tire = myCar.new Tire();
    Car.Engine engine = new Car.Engine();
  }
}
