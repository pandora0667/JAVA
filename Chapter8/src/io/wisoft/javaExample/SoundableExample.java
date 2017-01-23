package io.wisoft.javaExample;

/**
 * Created by jusk2 on 2017-01-21.
 */
public class SoundableExample {

  private static void printSound(Soundable soundable) {
    System.out.println(soundable.sound());
  }

  public static void main(String[] args) {
    printSound(new Cat());
    printSound(new Dog());
  }
}
