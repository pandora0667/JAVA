package State;

/**
 * Created by jusk2 on 2017-02-20.
 */
public class ThreadA extends Thread{
  public boolean stop = false;
  public boolean work = true;

  public void run() {
    while (!stop) {
      if (work) {
        System.out.println("ThreadA 작업내용");
      } else {
        Thread.yield();
      }
    }
    System.out.println("ThreadA 종료");
  }
}
