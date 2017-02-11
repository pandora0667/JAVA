package Chapter11.Example;

import java.util.HashMap;

/**
 * Created by jusk2 on 2017-02-11.
 */
public class StudentExample {
  public static void main(String[] args) {
    //Student 키로 초엄을 저장하는 HashMap 객체 생성
    HashMap<Student, String> hashMap = new HashMap<Student, String>();

    //new Student("1")의 점수 95저장
    hashMap.put(new Student("1"), "95");

    //new Student("1")로 점수를 읽어옴
    String score = hashMap.get(new Student("1"));
    System.out.println("1번 학생의 총점 : " + score);
  }
}
