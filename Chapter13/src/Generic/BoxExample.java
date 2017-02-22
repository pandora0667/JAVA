package Generic;

/**
 * Created by jusk2 on 2017-02-22.
 */
public class BoxExample {
  public static void main(String[] args) {
    Box<String> box1 = new Box<String>();
    box1.set("JAVA");
    String str = box1.get();

    System.out.println(str);

    Box<Integer> box2 = new Box<Integer>();
    box2.set(24);
    int age = box2.get();

    System.out.println(age);
  }
}
