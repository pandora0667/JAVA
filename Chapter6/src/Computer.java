/**
 * Created by jusk2 on 2017-01-04.
 */
public class Computer {

  int sum1 (int[] values) {
    int sum = 0;
    for(int save : values)
      sum += save;

    return sum;
  }

  int sum2 (int ... values) {
    int sum = 0;
    for(int save : values)
      sum += save;

    return sum;
  }
}
