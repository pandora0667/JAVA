/**
 * Created by jusk2 on 2017-01-04.
 */
public class CarExample {
  public static void main(String[] args) {

    Car myCar = new Car();

    // get Field
    System.out.println("제작회사 : " + myCar.company);
    System.out.println("모델명 : " + myCar.model);
    System.out.println("색깔 : " + myCar.color);
    System.out.println("최고속도 : " + myCar.maxSpeed);
    System.out.println("현재속도 : " + myCar.speed);

    System.out.println();

    //modify Field
    myCar.speed = 60;
    System.out.println("현재속도 : " + myCar.speed);
  }
}
