/**
 * Created by jusk2 on 2017-01-16.
 */
public abstract class SmartTelevision implements RemoteControl, Searchable {
  private int volume;

  public void turnOn() {
    System.out.println("TV를 켭니다.");
  }

  public void turnOff() {
    System.out.println("TV를 끕니다.");
  }

  public void setVolume(int volume) {
    if (volume > RemoteControl.MAX_VOLUME)
      this.volume = volume;
    else if (volume < RemoteControl.MIN_VOLUME)
      this.volume = volume;
    else
      this.volume = volume;

    System.out.println("현재 TV 볼륨 : " + volume);
  }

  public void search(String url) {
    System.out.println(url + "을 검색합니다.");
  }
}
