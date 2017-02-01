package System.Class.Instance;

/**
 * Created by jusk2 on 2017-02-02.
 */
public class NewInstanceExample {
  public static void main(String[] args) {
    try {
//      Class clazz = Class.forName("System.Class.Instance.SendAction");
      Class clazz = Class.forName("System.Class.Instance.ReceiveAction");

      Action action = (Action) clazz.newInstance();
      action.execute();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }
}
