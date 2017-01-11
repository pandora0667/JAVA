/**
 * Created by jusk2 on 2017-01-12.
 */
public class StudentExample {
  public static void main(String[] args) {

    Student student = new Student("이성원", "940630-1******", 24);

    System.out.println("name : " + student.name);
    System.out.println("ssn : " + student.ssn);
    System.out.println("studentNo : " + student.stdentNo);
  }
}

