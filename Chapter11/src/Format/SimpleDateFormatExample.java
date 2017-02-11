package Format;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jusk2 on 2017-02-02.
 */
public class SimpleDateFormatExample {
  public static void main(String[] args) {
    Date now = new Date();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    System.out.println( sdf.format(now) );

    sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
    System.out.println( sdf.format(now) );

    sdf = new SimpleDateFormat("yyyy.MM.dd");
    System.out.println( sdf.format(now) );

    sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
    System.out.println( sdf.format(now) );

    sdf = new SimpleDateFormat("오늘은 E요일");
    System.out.println( sdf.format(now) );
  }
}
