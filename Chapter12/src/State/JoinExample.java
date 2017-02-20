package State;

/**
 * Created by jusk2 on 2017-02-20.
 */
public class JoinExample {
  public static void main(String[] args) {
    SumThread sumThread = new SumThread();
    sumThread.start();

    try {
      sumThread.join();
    } catch (InterruptedException e) {
    }

    System.out.println("1~100 합 : " + sumThread.getSum());
  }
}
