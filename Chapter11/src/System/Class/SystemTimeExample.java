package System.Class;

/**
 * Created by jusk2 on 2017-02-01.
 */
public class SystemTimeExample {
  public static void main(String[] args) {
    long time1 = System.nanoTime();

    int sum = 0;
    for (long i=0; i<=1000000000; i++)
      sum += i;

    long time2 = System.nanoTime();

    System.out.println("합 : " + sum);
    System.out.println("걸린시간 : " + (time2-time1) + "ms");
  }
}
