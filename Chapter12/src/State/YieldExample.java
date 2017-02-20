package State;

/**
 * Created by jusk2 on 2017-02-20.
 */
public class YieldExample {
  public static void main(String[] args) {
    ThreadA threadA = new ThreadA();
    ThreadB threadB = new ThreadB();

    threadA.start();
    threadB.start();

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {}
    threadA.work = false;

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {}
    threadB.work = true;

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {}
    threadA.stop = true;
    threadB.stop = true;
  }
}
