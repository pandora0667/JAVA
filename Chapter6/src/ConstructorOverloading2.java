/**
 * Created by jusk2 on 2017-01-04.
 */
public class ConstructorOverloading2 {

  //filed
  String company = "현대자동차";
  String model;
  String color;
  int maxSpeed;

  //Constructor
  ConstructorOverloading2() {

  }

  ConstructorOverloading2(String model) {
    this(model, "SILVER", 250);
  }

  ConstructorOverloading2(String model, String color) {
    this(model, color, 250);
  }

  ConstructorOverloading2(String model, String color, int maxSpeed) {
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }


}
