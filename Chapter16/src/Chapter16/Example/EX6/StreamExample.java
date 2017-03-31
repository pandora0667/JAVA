package Chapter16.Example.EX6;

import java.util.Arrays;
import java.util.List;

/**
 * Created by seongwonlee on 2017. 3. 31..
 */
public class StreamExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("이성원", 10),
                new Member("박민영", 20),
                new Member("박찬열", 30)
        );

        double avg = list.stream()
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();

        System.out.println("평균나이 -> " + avg);
    }
    static class Member {
        private String name;
        private int age;

        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
