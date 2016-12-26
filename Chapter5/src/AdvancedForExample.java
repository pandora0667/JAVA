/**
 * Created by jusk2 on 2016-12-26.
 * Advanced For Example
 */
public class AdvancedForExample {
  public static void main(String[] args) {
    int[] scores = { 95, 71, 84, 93, 87 };
    int sum = 0;

    for (int score : scores)
      sum = sum + score;
    System.out.println("점수총합 : " + sum);

    double avg = (double)sum / scores.length;
    System.out.println("점수평균 = " + avg);
  }
}
