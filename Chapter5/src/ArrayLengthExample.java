/**
 * Created by jusk2 on 2016-12-26.
 * Array Length Example
 */
public class ArrayLengthExample {
  public static void main(String[] args) {
    int[] scores = { 83, 90, 87 };
    int sum = 0;
    for (int i=0; i<scores.length; i++) // 범위 초과시 Array Index Out Of Bounds Exception 발생
      sum += scores[i];

    System.out.println("총합 : " + sum);
    double avg = (double) sum / scores.length;
    System.out.println("평균 : " + avg);
    System.out.println(scores.length);
  }
}
