package Interface.Overlap;

/**
 * Created by jusk2 on 2017-01-25.
 */
public class MessageListener implements Button.OnClickListener {
  @Override
  public void onClick() {
    System.out.println("메시지를 보냅니다.");
  }
}
