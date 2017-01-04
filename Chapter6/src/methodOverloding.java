/**
 * Created by jusk2 on 2017-01-04.
 */
public class methodOverloding {

  //정사각형의 넓이
  double areaRectangle(double width) {
    return width + width;
  }

  //직사각형의 넓이
  double areaRectangle(double width, double height ) {
    return width * height;
  }
}
