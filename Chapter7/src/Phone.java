/**
 * Created by jusk2 on 2017-01-12.
 */
public abstract class Phone {

  //filed
  public String owner;

  //Constructor
  public Phone(String owner) {
    this.owner = owner;
  }

  //Method
  public void turnOn() {
    System.out.println("Phone 전원을 켭니다.");
  }

  public void turnOff() {
    System.out.println("Phone 전원을 끕니다.");
  }



}
