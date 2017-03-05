package ClassMember.LocalVariable;

/**
 * Created by jusk2 on 2017-03-05.
 */

public class UsingThis {
  public int outerField = 10;

  class Inner {
    int innerField = 20;

    void method() {
      MyFunctionalInterface fi= () -> {
        System.out.println("outerField: " + outerField);
        System.out.println("outerField: " + UsingThis.this.outerField + "\n");

        System.out.println("innerField: " + innerField);
        System.out.println("innerField: " + this.innerField + "\n");
      };
      fi.method();
    }
  }
}