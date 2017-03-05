package StaticMethod;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class Fruit {
  private String name;
  private int price;

  public Fruit(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String name() {
    return name;
  }

  public int price() {
    return price;
  }
}
