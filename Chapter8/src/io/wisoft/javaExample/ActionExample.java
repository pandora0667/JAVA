package io.wisoft.javaExample;

/**
 * Created by jusk2 on 2017-01-21.
 */
public class ActionExample {
  public static void main(String[] args) {

    Action action = new Action() {
      public void work() {
        System.out.println("복사를 합니다.");
      }
    };

    action.work();
  }
}
