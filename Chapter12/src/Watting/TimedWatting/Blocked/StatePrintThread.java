package Watting.TimedWatting.Blocked;

/**
 * Created by jusk2 on 2017-02-19.
 */
public class StatePrintThread extends Thread{
  private Thread targetThread;

  public  StatePrintThread(Thread targetThread) {
    this.targetThread = targetThread;
  }

  public void run() {
    while (true) {
      Thread.State state = targetThread.getState(); // 스레드 상태 얻기
      System.out.println("타켓 스레드 상태 : " + state);

      if (state == Thread.State.NEW) {  // 객체생성 상태이면, 실행대기로
        targetThread.start();
      }

      if (state == State.TERMINATED) {  // 종료상태이면 while 종료
        break;
      }
      try {
        // 0.5초간 일시정지
        Thread.sleep(500);
      }catch (Exception e) {}
    }
  }
}
