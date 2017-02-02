package Arrays.Sort;

import java.util.Arrays;

/**
 * Created by jusk2 on 2017-02-02.
 */
public class sortExample {
  public static void main(String[] args) {

    int[] scores = {99, 97, 98};
    Arrays.sort(scores);
    for (int i=0; i<scores.length; i++)
      System.out.println("Scores[" + i + "] = " + scores[i]);
    System.out.println();

    String[] names = {"이성원", "안덕기", "김남준"};
    Arrays.sort(names);
    for (int i=0; i<names.length; i++)
      System.out.println("Names[" + i + "] = " + names[i]);
    System.out.println();

    Member m1 = new Member("이성원");
    Member m2 = new Member("안덕기");
    Member m3 = new Member("김남준");
    Member[] members = {m1, m2, m3};
    Arrays.sort(members);
    for (int i=0; i<members.length; i++)
      System.out.println("Members[" + i + "] = " + members[i].name);
  }
}
