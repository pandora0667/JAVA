package Chapter16.Example.EX8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by seongwonlee on 2017. 3. 31..
 */
public class StreamExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("이성원", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        Map<String, List<String>> groppingMap = list.stream()
                .collect( Collectors.groupingBy(
                                Member::getJob,
                                Collectors.mapping(Member::getName, Collectors.toList())
                        )
                );

        System.out.print("[개발자] ");
        groppingMap.get("개발자").stream().forEach(s -> System.out.print(s + " "));

        System.out.println();

        System.out.print("[디자이너] ");
        groppingMap.get("디자이너").stream().forEach(s -> System.out.print(s + " "));
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
