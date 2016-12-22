import java.time.temporal.ChronoUnit;

/**
 * Created by jusk2 on 2016-12-22.
 * Input Data Check NaN Example
 */
public class InputDataCheckNaNExample2 {
  public static void main(String[] args) {
    String userInput = "NaN"; // 사용자로부터 입력값
    double val = Double.valueOf(userInput); // 입력값을 double 값으로 변환

    double currentBalance = 1000.0;
    if(Double.isNaN(val)) { // NaN검사, NaN(Not a Number)일 경우 조건문 실행
      System.out.println("NaN이 입력되어 처리할 수 없음");
      val = 0.0;
    }
    currentBalance += val;
    System.out.println(currentBalance);
  }
}
