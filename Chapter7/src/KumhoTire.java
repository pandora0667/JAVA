/*
 * Created by jusk2 on 2017-01-12.
 */
public class KumhoTire extends Tire {

  //filed
  //Constructor
  public KumhoTire(String location, int maxRotation) {
    super(location, maxRotation);
  }

  //Method
  @Override
  public boolean roll() {
    ++accumulatedRotation;
    if (accumulatedRotation < maxRatation) {
      System.out.println(location + "KumhoTire 수명 : " + (maxRatation - accumulatedRotation) + "회");
      return true;
    } else {
      System.out.println("*** " + location + " KumhoTire 펑크 +++");
      return false;
    }
  }
}
