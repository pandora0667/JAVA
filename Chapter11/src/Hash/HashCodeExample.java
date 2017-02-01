package Hash;

import java.util.Objects;

/**
 * Created by jusk2 on 2017-02-01.
 */
public class HashCodeExample {
  public static void main(String[] args) {
    Student s1 = new Student(1, "이성원");
    Student s2 = new Student(1, "이성원");
    System.out.println(s1.hashCode());
    System.out.println(Objects.hashCode(s2));
    System.out.println(s2.hashCode());
  }

  static class Student {
    int sno;
    String name;

    Student(int sno, String name) {
      this.sno = sno;
      this.name = name;
    }
    @Override
    public int hashCode() {
      return Objects.hash(sno, name);
    }
  }
}
