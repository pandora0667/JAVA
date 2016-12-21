/**
 * Created by jusk2 on 2016-12-21.
 * Accuracy Example
 */
public class AccuracyExample1_2 {
  public static void main(String[] args) {
    int apple = 1;
    int number = 7;

    //double pieceUnit = 0.1;
    //double result = apple - number*pieceUnit;
    // ----- (float, double)은 0.1을 정확히 표현이 불가능하여 근사치로 표현, 따라서 정확한 계산 X -----
    int toalPieces = apple *10;
    int temp = toalPieces - number;

    double result = temp/10.0;

    System.out.println("사과 한개에서 ");
    System.out.println("0.7 조각을 뺴면, ");
    System.out.println(result + "조각이 남는다.");
  }
}
