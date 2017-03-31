package Chapter16.Example.EX7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by seongwonlee on 2017. 3. 31..
 */
public class StreamExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("이성원", "개발지"),
                new Member("안덕기", "와이소프트"),
                new Member("박근혜", "죄인")
        );

        List<Member> developers = list.stream()
                .filter(m->m.getJob().equals("개발지"))
                .collect(Collectors.toList());

        developers.stream().forEach(m -> System.out.println(m.getName()));
    }
    static class Member {
        private String name;
        private String job;

        public Member(String name, String job) {
            this.name = name;
            this.job = job;
        }

        public String getName() {
            return name;
        }

        public String getJob() {
            return job;
        }
    }
}
