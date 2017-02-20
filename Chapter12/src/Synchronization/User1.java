package Synchronization;

/**
 * Created by jusk2 on 2017-02-19.
 */
public class User1 extends Thread {
  private Calculator calculator;

  public void setCalculator(Calculator calculator) {
    this.setName("User1");
    this.calculator = calculator;
  }

  public void run() {
    calculator.setMoney(50);
  }
}
