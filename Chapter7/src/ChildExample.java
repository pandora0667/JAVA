/**
 * Created by jusk2 on 2017-01-12.
 */
public class ChildExample {
  public static void main(String[] args) {
    Parent parent = new Child();

    parent.field1 = "data1";
    parent.method1();
    parent.method2();

    /*
    parent.field2 = "data2";
    parent.method3();
    */

    Child child = (Child)

        ;
    child.field2 = "yyy";
    child.method3();
  }
}
