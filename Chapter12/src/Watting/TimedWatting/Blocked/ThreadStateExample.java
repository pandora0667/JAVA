package Watting.TimedWatting.Blocked;

/**
 * Created by jusk2 on 2017-02-19.
 */
public class ThreadStateExample {
  public static void main(String[] args) {
    StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
    statePrintThread.start();
  }
}
