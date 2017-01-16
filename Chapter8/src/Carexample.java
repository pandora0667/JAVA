/**
 * Created by jusk2 on 2017-01-17.
 */
public class Carexample {
  public static void main(String[] args) {
    Car myCar = new Car();

    myCar.run();

    System.out.println();

    /*
    myCar.frontLeftTire = new KumhoTire();
    myCar.frontRightTire = new KumhoTire();
    */

    myCar.tires[0] = new KumhoTire();
    myCar.tires[1] = new KumhoTire();

    myCar.run();

  }
}
