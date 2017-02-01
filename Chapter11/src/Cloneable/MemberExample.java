package Cloneable;

/**
 * Created by jusk2 on 2017-02-01.
 * 복제 댇체를 변경하더라도 원본 객체는 변함 없음
 */
public class MemberExample {
  public static void main(String[] args) {
    //원본객체 생성
    Member original = new Member("jusk2", "SeongWon", "12345", 24, true);

    //복제 객체를 얻은 후에 패스워드변경
    Member cloned = original.getMember();
    cloned.password = "010-3025-0667";

    System.out.println("[원본 객체 필드값");
    System.out.println("ID : " + original.id);
    System.out.println("Name : " + original.name);
    System.out.println("Password : " + original.password);
    System.out.println("age : " + original.age);
    System.out.println("Adult : " + original.adult);

    System.out.println();

    System.out.println("[복제 객체 필드값");
    System.out.println("ID : " + cloned.id);
    System.out.println("Name : " + cloned.name);
    System.out.println("Password : " + cloned.password);
    System.out.println("age : " + cloned.age);
    System.out.println("Adult : " + cloned.adult);


  }
}
