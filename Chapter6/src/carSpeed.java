/**
 * Created by jusk2 on 2017-01-04.
 */
public class carSpeed {

  //filed
  int speed;

  //method
  int getSpeed() {
    return speed;
  }

  void keyTrueOn() {
    System.out.println("키를 돌립니다.");
  }

  void run() {
    for(int i=10; i<=50; i+=10) {
      speed = i;
      System.out.println("달립니다. (시속 : " + speed + "km/h)");
    }
  }
}
