/**
 * Created by jusk2 on 2017-01-04.
 */
public class ConstructorOverloadingExample {
  public static void main(String[] args) {

    ConstructorOverloading2 car1 = new ConstructorOverloading2();
    System.out.println("car1.company : " + car1.company);
    System.out.println(car1.color);
    System.out.println(car1.maxSpeed);
    System.out.println();

    ConstructorOverloading2 car2 = new ConstructorOverloading2("자가용");
    System.out.println("car2.company : " + car2.company);
    System.out.println("car2.model : " + car2.model);
    System.out.println(car1.color);
    System.out.println(car1.maxSpeed);
    System.out.println();

    ConstructorOverloading2 car3 = new ConstructorOverloading2("자가용", "RED");
    System.out.println("car3.company : " + car3.company);
    System.out.println("car3.model : " + car3.model);
    System.out.println("car3.color : " + car3.color);
    System.out.println();

    ConstructorOverloading2 car4 = new ConstructorOverloading2("택시", "BLACK", 200);
    System.out.println("car4.company : " + car4.company);
    System.out.println("car4.model :" + car4.model);
    System.out.println("car4.color : " + car4.color);
    System.out.println("car4.maxSpeed : " + car4.maxSpeed);
    System.out.println();
  }
}
