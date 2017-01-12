/**
 * Created by jusk2 on 2017-01-12.
 */
public class Cat extends Animal{
  public Cat() {
    this.kind = "포유류";
  }

  @Override
  public void sound() {
    System.out.println("야옹");
  }
}
