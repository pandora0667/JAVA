/**
 * Created by jusk2 on 2017-01-04.
 */
public class carGasExample {
  public static void main(String[] args) {

    carGas myCar = new carGas();

    myCar.setGas(2); // call setGas Method

    boolean gasStatus = myCar.isLeftGas();
    if(gasStatus) {
      System.out.println("출발합니다.");
      myCar.run();
    }

    if(myCar.isLeftGas()) {
      System.out.println("gas를 주입할 필요가 없습니다.");
    } else {
      System.out.println("gas를 주입하세요.");
    }
  }
}
