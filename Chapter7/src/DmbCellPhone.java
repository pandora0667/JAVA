/*
 * Created by jusk2 on 2017-01-11.
 */
public class DmbCellPhone extends CellPhone{

  //filed
  int channel;

  //Constructor
  DmbCellPhone(String model,  String color, int channel) {
    this.model = model;
    this.color = color;
    this.channel = channel;
  }

  //Method
  void turnOnDmb() {
    System.out.println("채널 " + channel + "번 방송수신을 시작합니다.");
  }

  void changeChannelDmb(int channel) {
    this.channel = channel;
    System.out.println("채널 " + channel + "번 으로 변경합니다. ");
  }

  void turnOffDmb() {
    System.out.println("DMB 벙송 수신을 중단합니다. ");
  }
}
