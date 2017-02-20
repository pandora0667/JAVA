import java.awt.*;

/**
 * Created by jusk2 on 2017-02-19.
 */
public class BeepTask {
  public void run(){
    Toolkit toolkit = Toolkit.getDefaultToolkit();

    for (int i=0; i<5; i++) {
      toolkit.beep();
      try { Thread.sleep(500); } catch (Exception e) {}
    }
  }
}
