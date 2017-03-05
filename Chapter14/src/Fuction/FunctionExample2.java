package Fuction;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class FunctionExample2 {
  private static List<Student> list = Arrays.asList(
      new Student("이성원", 90, 96),
      new Student("안덕기", 95, 100)
  );

  public static double avg(ToIntFunction<Student> function) {
    int sum = 0;
    for (Student student : list) {
      sum += function.applyAsInt(student);
      // 람다식 실행
    }
    double avg = (double) sum/list.size();
    return avg;
  }

  public static void main(String[] args) {
    double englishAvg = avg(s -> s.getEnglishScore());
    System.out.println("영어 평군 점수 : " + englishAvg);

    double mathScore = avg(s -> s.getMathScore());
    System.out.println("수학 평균 점수 : " + mathScore);
  }
}
