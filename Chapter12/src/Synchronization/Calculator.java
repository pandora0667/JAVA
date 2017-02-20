package Synchronization;

/**
 * Created by jusk2 on 2017-02-19.
 */
public class Calculator {
  private int money;

  public int getMoney() {
    return money;
  }

  public synchronized void setMoney(int money) {
    this.money = money;
    try {
      Thread.sleep(2000);
    }catch (InterruptedException e) {}
    System.out.println(Thread.currentThread().getName() + " : " + this.money);
  }
}
