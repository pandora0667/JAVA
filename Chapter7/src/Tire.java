/**
 * Created by jusk2 on 2017-01-12.
 */
public class Tire {

  //filed
  public int maxRatation;             // 최대 회전수 (타이어 수명)
  public int accumulatedRotation;     // 누적 회전수
  public String location;             // 타이어의 위치

  //Constructor
  public Tire(String location, int maxRatation) {
    this.location = location;
    this.maxRatation = maxRatation;
  }

  //Method
  public boolean roll() {
    ++accumulatedRotation;          // 누적 회전수 1 증가
    if (accumulatedRotation < maxRatation) {
      System.out.println(location + "Tire 수명 : " + (maxRatation - accumulatedRotation) + "회");
      return true;
    } else {
      System.out.println("*** " + location + "Tire 펑크 +++");
      return false;
    }
  }
}
