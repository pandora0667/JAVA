package Chapter15.Example;

/**
 * Created by seongwonlee on 2017. 3. 16..
 */
public class Student {
    public int studentNum;
    public String name;

    public Student (int studentNum, String name) {
        this.name = name;
        this.studentNum = studentNum;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }
        Student student = (Student) obj;
        if (studentNum != student.studentNum) {
            return false;
        } else {
            return true;
        }
    }
}
