package Daemon;

/**
 * Created by jusk2 on 2017-02-20.
 */
public class DaemonExample {
  public static void main(String[] args) {
    AutoSaveThread autoSaveThread = new AutoSaveThread();
    autoSaveThread.setDaemon(true);
    autoSaveThread.start();

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {}

    System.out.println("메인스레드 종료");
  }
}
