/**
 * Created by jusk2 on 2017-01-04.
 */
public class CalculatorExample {
  public static void main(String[] args) {

    Calculator myCalculator = new Calculator();
    myCalculator.powerOn();

    int resultPlus = myCalculator.plus(5, 7);
    System.out.println("Addition result : " + resultPlus);

    double resultDivide = myCalculator.divide(4, 2);
    System.out.println("Division result : " + resultDivide);

    System.out.println();
    myCalculator.powerOff();
  }
}
