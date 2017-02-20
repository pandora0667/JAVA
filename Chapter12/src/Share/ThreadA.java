package Share;

/**
 * Created by jusk2 on 2017-02-20.
 */
public class ThreadA extends Thread {
  private WorkObject workObject;

  public ThreadA (WorkObject workObject) {
    this.workObject = workObject;
  }

  @Override
  public void run() {
    for (int i=0; i<10; i++) {
      workObject.methodA();
    }
  }
}
