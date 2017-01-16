/**
 * Created by jusk2 on 2017-01-17.
 */
public class DriverExample {
  public static void main(String[] args) {
    Driver driver = new Driver();
    Vehicle vehicle = new Bus();

    //Bus bus = new Bus();
    Taxi taxi = new Taxi();

    //driver.drive(bus); //자동 타입변환 발생
    driver.drive(taxi);

    if (vehicle instanceof Bus) {
      Bus bus = (Bus) vehicle; // 강제 타입 변환
      bus.run();
      bus.checkFare();
    }
    vehicle.run();
  }
}
