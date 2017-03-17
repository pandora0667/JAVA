package List.Collection;

import java.util.Arrays;
import java.util.List;

/**
 * Created by seongwonlee on 2017. 3. 10..
 */
public class ArraysAsListExample {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("이성원", "안덕기", "김남준");
        for (String name : list1) {
            System.out.println(name);
        }

        List<Integer> list2 = Arrays.asList(24, 25, 26);
        for (int value : list2) {
            System.out.println(value);
        }
    }
}
