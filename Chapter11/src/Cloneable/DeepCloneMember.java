package Cloneable;

import java.util.Arrays;

/**
 * Created by jusk2 on 2017-02-01.
 */
public class DeepCloneMember implements Cloneable {
  public String name;
  public int age;
  public int[] scores;
  public Car car;

  public DeepCloneMember(String name, int age, int[] scores, Car car) {
    this.name = name;
    this.age = age;
    this.scores = scores;
    this.car = car;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    //먼저 얕은 복사를 해서 name, age를 복제한다.
    DeepCloneMember cloned = (DeepCloneMember) super.clone();
    //scores를 복제한다.
    cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
    //car를 복제한다.
    cloned.car = new Car(this.car.model);
    //깊은 복제된 Member 객체를 리턴
    return cloned;
  }

  public DeepCloneMember getMember() {
    DeepCloneMember cloned = null;
    try {
      cloned = (DeepCloneMember) clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return cloned;
  }
}


