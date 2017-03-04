package Chapter13.Example;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class ContainerExample2 {
  public static void main(String[] args) {
    Container2<String, String> container1 = new Container2<>();
    container1.set("이성원", "맥북사다");
    String name1 = container1.getKey();
    String doing = container1.getValue();

    System.out.println(name1 + " " + doing);

    Container2<String, Integer> container2 = new Container2<>();
    container2.set("MacBook Pro", 15);
    String name2 = container2.getKey();
    int inch = container2.getValue();

    System.out.println(name2 + " " +  inch);
  }
}
