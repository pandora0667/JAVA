package Interface.Overlap;

/**
 * Created by jusk2 on 2017-01-25.
 */
public class ButtonExample {
  public static void main(String[] args) {
    Button button = new Button();

    button.setOnClickListener(new CallListener());
    button.touch();

    button.setOnClickListener(new MessageListener());
    button.touch();
  }
}
