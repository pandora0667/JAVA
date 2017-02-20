package Group;

/**
 * Created by jusk2 on 2017-02-20.
 */
public class WorkThread extends Thread {
  public WorkThread (ThreadGroup threadGroup, String threadName) {
    super(threadGroup, threadName);
  }

  @Override
  public void run() {
    while (true) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println(getName() + " interrupted");
        break;
      } // interrupted Exception 이 발생할때, while 빠져나와 스레드 종료
    }
    System.out.println(getName() + " 종료됨");
  }
}
