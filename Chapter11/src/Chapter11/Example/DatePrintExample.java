package Chapter11.Example;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jusk2 on 2017-02-11.
 */
public class DatePrintExample {
  public static void main(String[] args) {
    Date now = new Date();
    SimpleDateFormat date  = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
    System.out.println(date.format(now));
  }
}
