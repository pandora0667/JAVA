package Chapter9.Example;

/**
 * Created by jusk2 on 2017-02-01.
 */
public class AnonymousExample {
  public static void main(String[] args) {
    Anonymous anonymous = new Anonymous();

    anonymous.filed.run();
    anonymous.method1();
    anonymous.method2(new Vehicle() {
      @Override
      public void run() {
        System.out.println("트럭이 달립니다.");
      }
    });
  }
}