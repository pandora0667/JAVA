/*
 * Created by jusk2 on 2017-01-12.
 */
public class SupersonicAirplaneExample {
  public static void main(String[] args) {

    SupersonicAirplane sa = new SupersonicAirplane();

    sa.takeOff();
    sa.fly();
    sa.flyMode = SupersonicAirplane.SUPERSONIC;
    sa.fly();
    sa.flyMode = SupersonicAirplane.NOMAL;
    sa.fly();
    sa.land();
  }
}
