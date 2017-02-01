package System.Class.Instance;

/**
 * Created by jusk2 on 2017-02-02.
 */
public class ReceiveAction implements Action{
  @Override
  public void execute() {
    System.out.println("데이터를 받습니다.");
  }
}
