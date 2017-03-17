package Chapter15.Example.TreeSet;

import java.util.TreeSet;

/**
 * Created by seongwonlee on 2017. 3. 16..
 */
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        treeSet.add(new Student("LEE", 96));
        treeSet.add(new Student("black", 86));
        treeSet.add(new Student("green", 92));

        Student student = treeSet.last();
        System.out.println("최고점수 : " + student.score);
        System.out.println("최고점수를 받은 아이디 : " + student.id);

    }
}
