package Chapter16.Example.EX5;

import java.util.Arrays;
import java.util.List;

/**
 * Created by seongwonlee on 2017. 3. 31..
 */
public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is a JAVA Book",
                "Lambda Expressions",
                "Java8 support lambda expressions"
        );

        list.stream()
                .filter(a->a.toLowerCase().contains("java"))
                .forEach(a-> System.out.println(a));
    }
}
