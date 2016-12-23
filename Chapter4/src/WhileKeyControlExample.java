/**
 * Created by jusk2 on 2016-12-23.
 * While Key Control Example
 */
public class WhileKeyControlExample {
  public static void main(String[] args) throws Exception {
    boolean run = true;
    int speed = 0, keyCode = 0;

    while (run) {
      if (keyCode != 13 && keyCode != 10) { // CR(캐리지리턴), LF(라인피드) 제외
        System.out.println("--------------------");
        System.out.println("1.증속, 2감속, 3 중지");
        System.out.println("--------------------");
        System.out.print("선택 : ");
      }
      keyCode = System.in.read(); // 키보드에서 키를 읽음

      if (keyCode == 49) { // 1을 읽었을 경우
        speed++;
        System.out.println("현재속도 = " + speed);
      } else if (keyCode == 50) { // 2를 읽었을 경우
        speed--;
        System.out.println("현재속도 = " + speed);
      } else if (keyCode == 51) { // 3을 읽었을 경우
        run = false;
      }
    }
  }
}
