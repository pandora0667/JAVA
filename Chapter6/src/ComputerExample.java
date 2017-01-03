/**
 * Created by jusk2 on 2017-01-04.
 */
public class ComputerExample {
  public static void main(String[] args) {

    Computer myCom = new Computer();

    int[] values1 = {1, 2, 3};
    int result1 = myCom.sum1(values1);
    System.out.println("result 1 : " + result1);

    int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
    System.out.println("result2 : " + result2);

    int result3 = myCom.sum2(1, 2, 3);
    System.out.println("result3 : " + result3);

    // 많은 가변인자 배열을 생성하여 사용하고 있음
    int result4 = myCom.sum2(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    System.out.println("result4 : " + result4);
  }
}
