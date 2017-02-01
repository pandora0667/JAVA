package Cloneable;

/**
 * Created by jusk2 on 2017-02-01.
 */

public class DeepCloneMemberExample {
  public static void main(String[] args) {
    //원본 객체 생성
    DeepCloneMember original = new DeepCloneMember("이성원", 24, new int[] {10, 20}, new Car("벤츠"));

    //복제 객체를 얻은 후에 참조 객체의 값을 변경
    DeepCloneMember cloned = original.getMember();
    cloned.scores[0] = 100;
    cloned.car.model = "소나타 하이브리드";

    System.out.println("복제 객체의 필드값");
    System.out.println("Name :" + cloned.name);
    System.out.println("Age :" + cloned.age);
    System.out.print("Scores : {");
    for (int i=0; i<cloned.scores.length; i++) {
      System.out.print(cloned.scores[i]);
      System.out.print((i==(cloned.scores.length-1))?"":",");
    }
    System.out.println("}");
    System.out.println("Car : " + cloned.car.model);

    System.out.println();

    System.out.println("원본 객체의 필드값");
    System.out.println("Name :" + original.name);
    System.out.println("Age :" + original.age);
    System.out.print("Scores : {");
    for (int i=0; i<original.scores.length; i++) {
      System.out.print(original.scores[i]);
      System.out.print((i==(original.scores.length-1))?"":",");
    }
    System.out.println("}");
    System.out.println("Car : " + original.car.model);
  }
}

