package Excute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by jusk2 on 2017-02-20.
 */
public class ExcuteExample {
  public static void main(String[] args) throws Exception {
    ExecutorService executorService = Executors.newFixedThreadPool(2); // 최대스레드 개수가 2인 스레드풀 생성

          for (int i=0; i<10; i++) {
            Runnable runnable = new Runnable() {
              @Override
              public void run() {
                // 스레드 총 개수 및 작업 그레드 이름 출력
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
          int poolSize = threadPoolExecutor.getPoolSize();
          String threadName = Thread.currentThread().getName();
          System.out.println("[총 스레드 개수 : " + poolSize + "] 작업 스레드 이름 : " + threadName);

          //예외 발생시킴
          int value = Integer.parseInt("삼");
        }
      };

//      executorService.execute(runnable);
      executorService.submit(runnable); // 가급적 사용하길 권장, 예외가 발생해도 스레드가 종료되지 않고 다음 작업을 위해 재사용

      Thread.sleep(10);
    }

    executorService.shutdown(); // 스레드 풀 종료
  }
}
