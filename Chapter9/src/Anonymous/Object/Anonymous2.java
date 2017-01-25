package Anonymous.Object;

/**
 * Created by jusk2 on 2017-01-25.
 */
public class Anonymous2 {
  // 필드 초기값으로 대입
  RemoteControl field  = new RemoteControl() {
    @Override
    public void turnOn() {
      System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
      System.out.println("TV를 끕니다.");
    }
  };

  void method1() {
    RemoteControl localVal = new RemoteControl() {
      @Override
      public void turnOn() {
        System.out.println("Audio를 켭니다.");
      }

      @Override
      public void turnOff() {
        System.out.println("Audio를 끕니다.");
      }
    };
    // 로컬 변수 사용
    localVal.turnOn();
    localVal.turnOff();
  }

  void method2(RemoteControl rc) {
    rc.turnOn();
    rc.turnOff();
  }
}
