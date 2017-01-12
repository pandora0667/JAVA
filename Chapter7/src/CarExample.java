/*
 * Created by jusk2 on 2017-01-12.
 */
public class CarExample {
  public static void main(String[] args) {
    Car car = new Car();

    for(int i=0; i<=5; i++) {               // Car 객체의 run() 메소드 5번 반복실행
      int problemLocation = car.run();

      switch (problemLocation) {
        case 1:
          System.out.println("앞 왼쪽 HankkokTire로 교체");
          car.frontLeftTire = new HankookTire("앞 왼쪽", 13);
          break;

        case 2:
          System.out.println("앞 오른쪽 KumhoTire 교체");
          car.frontRightTire = new KumhoTire("앞 오른쪽", 13);
          break;

        case 3:
          System.out.println("앞 오른쪽 HankookTire 교체");
          car.backLeftTire = new HankookTire("뒤 왼쪽", 14);
          break;

        case 4:
          System.out.println("앞 오른쪽 KumhoTire 교체");
          car.backRightTire = new KumhoTire("뒤 오른쪽", 17);
          break;
      }

      System.out.println("-----------------------------------");  // 1회전시 출력되는 내용을 구분
    }
  }
}
