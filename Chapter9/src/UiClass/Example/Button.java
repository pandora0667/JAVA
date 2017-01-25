package UiClass.Example;

/**
 * Created by jusk2 on 2017-01-25.
 */
public class Button {
  OnClickListener listener;

  void setOnClickListener(OnClickListener listener) {
    this.listener = listener;
  }

  void touch() {
    listener.onClick();
  }

  interface OnClickListener {
    void onClick();
  }
}
