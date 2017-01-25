package UiClass.Example;

/**
 * Created by jusk2 on 2017-01-25.
 */
public class Windows {
  Button button1 = new Button();
  Button button2 = new Button();

  //필드 초기값으로 대입
  Button.OnClickListener listener = new Button.OnClickListener() {
    @Override
    public void onClick() {
      System.out.println("전화를 겁니다.");
    }
  };

  Windows() {
    button1.setOnClickListener(listener);
    button2.setOnClickListener(new Button.OnClickListener() {
      @Override
      public void onClick() {
        System.out.println("메시지를 보냅니다.");
      }
    });
  }
}
