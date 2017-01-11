/**
 * Created by jusk2 on 2017-01-12.
 */
public class HankookTire extends Tire {

  //filed
  //Constructor
  public HankookTire(String location, int maxRotation) {
    super(location, maxRotation);
  }

  //Method
  @Override
  public boolean roll() {
    ++accumulatedRotation;
    if (accumulatedRotation < maxRatation) {
      System.out.println(location + "HankookTire 수명 : " + (maxRatation - accumulatedRotation) + "회");
      return true;
    } else {
      System.out.println("*** " + location + " HankookTire 펑크 +++");
      return false;
    }
  }
}
