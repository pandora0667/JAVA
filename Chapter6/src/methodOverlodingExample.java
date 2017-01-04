/**
 * Created by jusk2 on 2017-01-04.
 */
public class methodOverlodingExample {
  public static void main(String[] args) {

    methodOverloding myCalcu = new methodOverloding();

    //정사각형의 넓이 구하기
    double result1 = myCalcu.areaRectangle(10);

    //직사각형의 넓이 구하기
    double result2 = myCalcu.areaRectangle(10, 20);

    System.out.println("정사각형 넓이 = " + result1);
    System.out.println("직사각형의 넓이 = " + result2);
  }
}
