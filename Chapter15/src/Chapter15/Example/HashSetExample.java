package Chapter15.Example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by seongwonlee on 2017. 3. 16..
 */
public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        set.add(new Student(20131792, "이성원"));
        set.add(new Student(20131791, "이건희"));
        set.add(new Student(20131792, "이소원"));

        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.studentNum + " : " + student.name);
        }
    }
}
