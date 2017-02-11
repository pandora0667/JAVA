package Chapter11.Example;

/**
 * Created by jusk2 on 2017-02-11.
 */
public class Student {
  private String studentNum;

  public Student(String studentNum) {
    this.studentNum = studentNum;
  }

  public String getStudentNum() {
    return studentNum;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Student) {
      Student student  = (Student) obj; // 타입변환
      if (studentNum.equals(student.getStudentNum())) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int hashCode() {
    return studentNum.hashCode();
  }
}
