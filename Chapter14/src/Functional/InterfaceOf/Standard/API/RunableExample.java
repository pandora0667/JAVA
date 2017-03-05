package Functional.InterfaceOf.Standard.API;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class RunableExample {
  public static void main(String[] args) {
    Runnable runnable = () -> {
      for (int i=0; i<10; i++) {
        System.out.println(i);
      }
    };
    Thread thread = new Thread(runnable);
    thread.start();
  }
}
