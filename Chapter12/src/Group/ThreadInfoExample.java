package Group;

import Daemon.AutoSaveThread;

import java.util.Map;
import java.util.Set;

/**
 * Created by jusk2 on 2017-02-20.
 */
public class ThreadInfoExample {
  public static void main(String[] args) {
    AutoSaveThread autoSaveThread = new AutoSaveThread();
    autoSaveThread.setName("AutoSaveThread");
    autoSaveThread.setDaemon(true);
    autoSaveThread.start();

    // 15장에서 학습
    Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
    Set<Thread> threads = map.keySet();

    for (Thread thread : threads) {
      System.out.println("Name : " + thread.getName() + ((thread.isDaemon())?"(데몬)": "(주)"));
      System.out.println("\t" + "소속그룹 : " + thread.getThreadGroup().getName());
      System.out.println();
    }
  }
}
