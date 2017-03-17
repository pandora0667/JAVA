package Chapter14.Example;

import java.util.function.ToIntFunction;

/**
 * Created by seongwonlee on 2017. 3. 9..
 */
public class LambdaExample2 {
    public static Student[] students = {
            new Student("이성원", 95, 80),
            new Student("안덕기", 85, 90)
    };

    public static double avg(ToIntFunction<Student> function) {
        double sum = 0.0;
        for (Student student : students) {
            sum += function.applyAsInt(student);
        }
        double avg = sum / students.length;
        return avg;
    }

    public static void main(String[] args) {
        double englishAvg = avg(Student::getEnglishScore); // 메소드 참조 방식
        System.out.println("영어 평균 점수 : " + englishAvg);

        double mathAvg = avg(s -> s.getMathScore());
        System.out.println("수학 평균 점수 : " + mathAvg);
    }

    public static class Student {
        private String name;
        private int englishScore;
        private int mathScore;

        public Student(String name, int englishScore, int mathScore) {
            this.name = name;
            this.englishScore = englishScore;
            this.mathScore = mathScore;
        }

        public int getEnglishScore() { return englishScore; }
        public int getMathScore() { return mathScore; }
    }
}