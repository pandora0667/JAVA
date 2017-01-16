/**
 * Created by jusk2 on 2017-01-16.
 */
public class Television implements RemoteControl {

  //field
  private int volume;

  //turnOn() 추상 메소드의 실체 메소드
  public void turnOn() {
    System.out.println("TV를 킵니다.");
  }

  //turnOff() 추상 메소드의 실체 메소드
  public void turnOff() {
    System.out.println("TV를 끕니다.");
  }

  //setVolume() 추상 메소드의 실체 메소드
  public void setVolume(int volume) {

    if (volume > RemoteControl.MAX_VOLUME)
      this.volume = RemoteControl.MAX_VOLUME;
    else if (volume < RemoteControl.MIN_VOLUME)
      this.volume = RemoteControl.MIN_VOLUME;
    else
      this.volume = volume;

    System.out.println("현재 TV 볼륨 : " + volume);
  }
}
