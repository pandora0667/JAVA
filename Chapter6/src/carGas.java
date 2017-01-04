/**
 * Created by jusk2 on 2017-01-04.
 */
public class carGas {

  //filed
  int gas;

  //method
  void setGas(int gas) {
    this.gas = gas;
  }

  boolean isLeftGas() {

    if (gas == 0) {
      System.out.println("gas가 없습니다.");
      return false;
    }
    System.out.println("gas가 있습니다.");
    return true;
  }

  void run() {

    while (true) {
      if (gas > 0) {
        System.out.println("(달립니다. gas잔량 : " + gas + ")");
        gas -= 1;
      } else {
        System.out.println("(멈춤니다. gas잔량 : " + gas + ")");
        return;
      }

    }
  }
}
