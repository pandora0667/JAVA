package State;

/**
 * Created by jusk2 on 2017-02-20.
 */
public class ThreadB extends Thread{
  public boolean stop = false;
  public boolean work = true;

  public void run() {
    while (!stop) {
      if (work) {
        System.out.println("ThreadB 작업 내용");
      } else {
        ThreadB.yield();
      }
    }
    System.out.println("ThreadB 종료");
  }
}
