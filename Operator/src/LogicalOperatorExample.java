/**
 * Created by jusk2 on 2016-12-22.
 * Logical Operator Example
 */
public class LogicalOperatorExample {
  public static void main(String[] args) {
    int charCode ='A';

    if( (charCode >= 65) & (charCode <= 90))
      System.out.println("대문자 이군요");
    if( (charCode >= 97) && (charCode <= 122))
      System.out.println("소문자 이군요");

    if( !(charCode < 48) && !(charCode > 57))
      System.out.println("0 ~ 9 숫자 이군요");
// ---------- &&, || 모두 앞의 연산이 false or true 라면 바로 결과 도출 ----------
// ---------- &, | 두 피연산자 모두를 평가해서 산출결과 도출, 효휼성이 떨어짐 ----------
    int value = 6;

    if( (value % 2 == 0) | (value % 3 == 0) )
      System.out.println("2 또는 3의 배수 이군요");
    if( (value % 2 == 0) || (value % 3 == 0) )
      System.out.println("2 또는 3의 배수 이군요");
  }
}
