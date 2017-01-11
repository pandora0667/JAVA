/*
 * Created by jusk2 on 2017-01-12.
 */
public class DmbCellPhoneExample {
  public static void main(String[] args) {

    //DmbCellPhone 객체생성
    DmbCellPhone dmbCellPhone = new DmbCellPhone("안드로이드", "실버", 10);

    //CellPhone 으로 상속받은 필드
    System.out.println("모델 :" + dmbCellPhone.model);
    System.out.println("색상 :" + dmbCellPhone.color);

    //DmbCellPhone 필드
    System.out.println("채널 : " + dmbCellPhone.channel);

    //CellPhone 으로부터 상속받은 메소드 호출
    dmbCellPhone.powerOn();
    dmbCellPhone.powerOff();

    dmbCellPhone.sendVoice("안녕하세요~");
    dmbCellPhone.receiveVoice("네~ 무슨일이시죠?");
    dmbCellPhone.sendVoice("자바 상속 테스트중에 있습니다.");
    dmbCellPhone.hangUp();

    //DmbCellPhone 메소드 호출
    dmbCellPhone.turnOnDmb();
    dmbCellPhone.changeChannelDmb(15);
    dmbCellPhone.turnOffDmb();
  }
}
