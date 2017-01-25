package Anonymous.Object;

/**
 * Created by jusk2 on 2017-01-25.
 */
public class AnonymousExample2 {
  public static void main(String[] args) {
    Anonymous2 anonymous2 = new Anonymous2();

    // 익명 객체 필드 사용
    anonymous2.field.turnOn();
    anonymous2.field.turnOff();
    System.out.println();

    // 익명 객체 로컬 변수 사용
    anonymous2.method1();
    System.out.println();

    // 악명 객체 매개값 사용
    anonymous2.method2(
        new RemoteControl() {
          @Override
          public void turnOn() {
            System.out.println("Smart TV를 켭니다.");
          }
          @Override
          public void turnOff() {
            System.out.println("Smart TV를 끕니다.");
          }
        }
    );
  }
}
