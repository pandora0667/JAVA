import java.util.Scanner;

/**
 * Created by jusk2 on 2016-12-28.
 * Chapter05 Exercise09
 */
public class Exercise09 {
  public static void main(String[] args) {
    boolean run = true;
    int studentNum = 0;
    int[] score = null;
    Scanner scanner = new Scanner(System.in);

     while (run) {
      System.out.println("|----------------------------------------------------------|");
      System.out.println("| 1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5.종료 |");
      System.out.println("|----------------------------------------------------------|");
      System.out.print("선택 > ");
      int selectNumber = scanner.nextInt();

      switch (selectNumber) {

        case 1:
          System.out.print("학생수 입력 > ");
          studentNum = scanner.nextInt();
          score = new int[studentNum]; // Null 이므로 배열 초기화
          break;

        case 2:
          for (int i=0; i<score.length; i++) {
            System.out.print("score[" + i + "] > ");
             score[i] = scanner.nextInt();
          }
          break;

        case 3:
          for (int i=0; i<score.length; i++)
            System.out.println("score[" + i + "] : " + score[i]);
          break;

        case 4:
          int maxScore = 0, sumScore = 0;
          double avgScore = 0.0D;

          for (int i=0; i<score.length; i++) {
            sumScore += score[i];
            if (maxScore < score[i])
              maxScore = score[i];
          }

          avgScore = sumScore / score.length;
          System.out.println("최고 점수 : " + maxScore);
          System.out.println("평균 점수 : " + avgScore);
          break;

        case 5:
          run = false;
          break;

        default:
          System.out.println("다시 입력하세요. ");
      }
    }
  }
}
