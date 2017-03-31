package parallel;

import java.util.Arrays;
import java.util.List;

/**
 * Created by seongwonlee on 2017. 3. 18..
 */
public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("이성원", 10),
                new Student("안덕기", 20),
                new Student("김남준", 30)
        );

        double avg = studentList.stream()
                //중간처리(학생 객체를 점수로 매핑)
                .mapToInt(Student :: getScore)
                //최종 처리(평균 점수)
                .average()
                .getAsDouble();

        System.out.println("평균 점수: " + avg);
    }
}
