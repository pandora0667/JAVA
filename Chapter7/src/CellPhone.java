/*
 * Created by jusk2 on 2017-01-11.
 */
public class CellPhone {
  //filed
  String model;
  String color;

  //Constructor

  //Method
  void powerOn() {
    System.out.println("POWER ON");
  }

  void powerOff() {
    System.out.println("POWER OFF");
  }

  void bell() {
    System.out.println("벨이 울립니다.");
  }

  void sendVoice(String message) {
    System.out.println("본인 : " + message);
  }

  void receiveVoice(String message) {
    System.out.println("상대방 : " + message);
  }

  void hangUp() {
    System.out.println("전화를 끓습니다.");
  }
}
