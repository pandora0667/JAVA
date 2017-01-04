/**
 * Created by jusk2 on 2017-01-04.
 */
public class getterSetterExample {
  public static void main(String[] args) {

    getterSetter myCar = new getterSetter();

    //잘못된 속도변경
    myCar.setSpeed(-60);
    System.out.println("현재속도 : " + myCar.getSpeed());
    System.out.println();

    //올바른 속도변경
    myCar.setSpeed(100);
    System.out.println("현재속도 : " + myCar.getSpeed());

    //멈춤
    if(!myCar.isStop())
      myCar.setStop(true);

    System.out.println("현재속도 : " + myCar.getSpeed());
  }
}
