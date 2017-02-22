package Method;

/**
 * Created by jusk2 on 2017-02-22.
 */
public class Util {
   public static <T> Box<T> boxing(T t) {
    Box<T> box = new Box<T>();
    box.set(t);
    return box;
  }
}
