/*
 * Created by jusk2 on 2017-01-12.
 */
public class Student extends People{
  public int stdentNo;

  public Student(String name, String ssn, int studentNo) {
    super(name, ssn);
    this.stdentNo = studentNo;
  }
}
