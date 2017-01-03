/**
 * Created by jusk2 on 2017-01-04.
 */
public class ConstructorOverloading {

  //filed
  String company = "현대자동차";
  String model;
  String color;
  int maxSpeed;

  //Constructor
  ConstructorOverloading() { }

  ConstructorOverloading(String model) {
    this.model = model;
  }

  ConstructorOverloading(String model, String color) {
    this.model = model;
    this.color = color;
  }

  ConstructorOverloading(String model, String color, int maxSpeed) {
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }
}
