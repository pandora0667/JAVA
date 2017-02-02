package Arrays.Sort;

import java.util.Arrays;

/**
 * Created by jusk2 on 2017-02-02.
 */
public class SearchExample {
    public static void main(String[] args) {
        int[] scores = {99, 97, 98};
        Arrays.sort(scores);
        int index = Arrays.binarySearch(scores, 99);
        System.out.println("찾은 인덱스 : " + index);

        System.out.println();

        String[] names = {"이성원", "안덕기", "김남준"};
        Arrays.sort(names);
        index = Arrays.binarySearch(names, "이성원");
        System.out.println("찾은 인덱스 : " + index);

        System.out.println();

        Member m1 = new Member("이성원");
        Member m2 = new Member("안덕기");
        Member m3 = new Member("김남준");
        Member[] members = {m1, m2, m3};
        Arrays.sort(members);
        index = Arrays.binarySearch(members, m1);
        System.out.println("찾은 인덱스 : " + index);
    }
}
