import com.sun.org.apache.xpath.internal.SourceTree;

import javax.sound.midi.Soundbank;
import java.util.DoubleSummaryStatistics;

/**
 * Created by jusk2 on 2016-12-22.
 * Infinity And Check Example
 */
public class InfinityAndCheckExample {
  public static void main(String[] args) {
    int x = 5;
    double y = 0.0;

    double z = x / y;
    //double z = x % y;

    System.out.println(Double.isInfinite(z));
    System.out.println(Double.isNaN(z));
    System.out.println(z + 2);
  }
}
