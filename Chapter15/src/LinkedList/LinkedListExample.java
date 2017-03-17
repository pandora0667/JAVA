package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by seongwonlee on 2017. 3. 10..
 */
public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();

        long startTime, endTime;

        startTime = System.nanoTime();
        for (int i=0; i<10000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.println("Array List 걸린시간 : " + (endTime-startTime) + " ns");

        startTime = System.nanoTime();
        for (int i=0; i<10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.println("Linked List 걸린시간 : " + (endTime-startTime) + " ns");

    }
}
