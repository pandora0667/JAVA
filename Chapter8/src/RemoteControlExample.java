/**
 * Created by jusk2 on 2017-01-16.
 */
public class RemoteControlExample {
  public static void main(String[] args) {

    RemoteControl rc = null;
    RemoteControl.changeBattery();

    rc = new Television();
    rc.turnOn();
    rc.turnOff();
    rc.setMute(true);

    System.out.println();

    rc = new Audio();
    rc.turnOn();
    rc.turnOff();
    rc.setMute(false);



    /*
    //익명 구현 클래스
    RemoteControl rc = new RemoteControl() {
      @Override
      public void turnOn() {

      }

      @Override
      public void turnOff() {

      }

      @Override
      public void setVolume() {

      }
    };

    // 구현 객체를 인터페이스 변수에 대입해서 사용한다.
    rc = new Television();
    rc = new Audio();
  */
  }
}
