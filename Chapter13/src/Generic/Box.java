package Generic;

/**
 * Created by jusk2 on 2017-02-22.
 */
public class Box<T> {
  private T t;
  public T get() {
    return t;
  }

  public void set(T t) {
    this.t = t;
  }
}
