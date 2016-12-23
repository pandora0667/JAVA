/**
 * Created by jusk2 on 2016-12-23.
 * for문을 이용해서 1~100중에 3의 배수의 총합을 구하시오
 */
public class Exercise03 {
  public static void main(String[] args) {
    int total = 0;
    for (int range=0; range<=100; range++) {
      if(range % 3 == 0)
        total += range;
    }
    System.out.println(total);
  }
}
