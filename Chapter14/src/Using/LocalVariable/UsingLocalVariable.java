package Using.LocalVariable;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class UsingLocalVariable {
  void method(int arg) {  // arg final 특성을 가짐
    int localVar = 40;

    //람다식
    MyFunctionalInterface fi = () -> {
      System.out.println("arg : " + arg);
      System.out.println("localVar : " + localVar + "\n");
    };
    fi.method();
  }
}
