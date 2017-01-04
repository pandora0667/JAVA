/**
 * Created by jusk2 on 2017-01-04.
 */
public class carSpeedExample {
  public static void main(String[] args) {

    carSpeed myCar = new carSpeed();
    myCar.keyTrueOn();
    myCar.run();

    int speed = myCar.getSpeed();
    System.out.println("현재속도 : " + speed + "km/h");
  }
}
