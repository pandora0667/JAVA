package Chapter13.Example;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class ContainerExample1 {
  public static void main(String[] args) {
    Container1<String> container1 = new Container1<>();
    container1.set("이성원");
    String str = container1.get();

    Container1<Integer> container2 = new Container1<>();
    container2.set(6);
    int value = container2.get();

    System.out.println(str + ", " + value);
  }
}
