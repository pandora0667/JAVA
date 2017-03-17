package List.Collection;

import java.util.*;

/**
 * Created by seongwonlee on 2017. 3. 10..
 */
public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("JAVA");
        list.add("JDBC");
        list.add("Network");
        list.add("Apple MacBook Pro");
        list.add("LEE SUNG WON");

        int size = list.size();
        System.out.println("총 객체수 : " + size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("2 : " + skill);
        System.out.println();

        for (int i=0; i<list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + " : " + str);
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("LEE SUNG WON");

        for (int i=0; i<list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + " : " + str);
        }
    }
}
