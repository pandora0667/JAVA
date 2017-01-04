/**
 * Created by jusk2 on 2017-01-04.
 */

public class Singleton {

  private static Singleton singleton = new Singleton();

  private Singleton() {}

  static  Singleton getInstance() {
    return singleton;
  }
}
