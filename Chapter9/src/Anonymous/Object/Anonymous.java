package Anonymous.Object;

/**
 * Created by jusk2 on 2017-01-25.
 */
public class Anonymous {
  // 필드 초기값으로 대입
  Person field = new Person() {
    void work() {
      System.out.println("출근 합니다.");
    }

    @Override
    void wake() {
      System.out.println("6시에 일어납니다.");
      work();
    }
  }; // 익명 객체는 하나의 실행문이므로 ;을 반드시 붙인다.

  void method1() {
    // 로컬 변수값으로 대입
    Person localVal = new Person() {
      void walk() {
        System.out.println("산책합니다.");
      }

      @Override
      void wake() {
        System.out.println("7시에 일어납니다.");
        walk();
      }
    };

    localVal.wake();
  }

  void method2(Person person) {
    person.wake();
  }
}
