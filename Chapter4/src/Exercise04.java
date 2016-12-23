/**
 * Created by jusk2 on 2016-12-23.
 * Math.random()메소드를 사용하여 주사위 2개의 합이 5가 되면 종료하는 코드를 작성하시오
 */
public class Exercise04 {
  public static void main(String[] args) {
    int dice1, dice2;

    while (true) {
      dice1 = (int)(Math.random()*6) + 1;
      dice2 = (int)(Math.random()*6) + 1;
      if ((dice1 + dice2) == 5)
        break;
      System.out.println("(" + dice1 + ", " + dice2 + ")");
    }
  }
}
