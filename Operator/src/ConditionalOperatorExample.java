/**
 * Created by jusk2 on 2016-12-22.
 * Conditional Operator Example
 */
public class ConditionalOperatorExample {
  public static void main(String[] args) {
    int score = 95;
    char grade = (score > 90) ? 'A' : ( (score >80 ) ? 'B' : 'C' );
    System.out.println(score + "점은 " + grade + "등급입니다.");
  }
}
