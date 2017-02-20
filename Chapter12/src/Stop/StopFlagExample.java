package Stop;

/**
 * Created by jusk2 on 2017-02-20.
 */
public class StopFlagExample {
  public static void main(String[] args) {
    PrintThread1 printThread1 = new PrintThread1();
    printThread1.start();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {}

    printThread1.setStop(true);
  }
}
