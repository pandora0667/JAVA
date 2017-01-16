/**
 * Created by jusk2 on 2017-01-16.
 */
public class Audio implements RemoteControl {

  //field
  private int volume;
  private boolean mute;

  //turnOn() 추상 메소드의 실체 메소드
  public void turnOn() {
    System.out.println("Audio를 켭니다.");
  }

  //turnOff() 추상 메소드의 실체 메소드
  public void turnOff() {
    System.out.println("Audio를 끕니다.");
  }

  //setVolume() 추상 메소드의 실체 메소드
  public void setVolume(int volume) {
    if (volume > RemoteControl.MAX_VOLUME)
      this.volume = volume;
    else if (volume > RemoteControl.MIN_VOLUME)
      this.volume = volume;
    else
      this.volume = volume;

    System.out.println("현재 Audio 볼륨 : " + volume);
  }

  @Override
  public void setMute(boolean mute) {
    this.mute = mute;

    if (mute)
      System.out.println("Audio 무음 처리합니다.");
    else
      System.out.println("Audio 무음 해제합니다.");
  }
}
