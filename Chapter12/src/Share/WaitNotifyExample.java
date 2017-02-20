package Share;

/**
 * Created by jusk2 on 2017-02-20.
 */
public class WaitNotifyExample {
  public static void main(String[] args) {
    WorkObject shareObject = new WorkObject(); // 공유객체 생성

    ThreadA threadA = new ThreadA(shareObject);
    ThreadB threadB = new ThreadB(shareObject);

    threadA.start();
    threadB.start();
  }
}
