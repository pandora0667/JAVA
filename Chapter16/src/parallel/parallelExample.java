package parallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by seongwonlee on 2017. 3. 18..
 */
public class parallelExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
          "이성원", "안덕기", "박민영", "서유리", "박찬열"
        );

        Stream<String> stream = list.stream();
        stream.forEach(parallelExample:: print);
        System.out.println();

        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(parallelExample :: print);
    }

    public static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
