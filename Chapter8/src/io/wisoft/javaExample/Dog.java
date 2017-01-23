package io.wisoft.javaExample;

/**
 * Created by jusk2 on 2017-01-21.
 */
public class Dog implements Soundable{

  @Override
  public String sound(){
    String animalSound = "멍멍";
    return animalSound;
  }
}
