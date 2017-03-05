package ClassMember.LocalVariable;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class UsingThisExample {
  public static void main(String... args) {
    UsingThis usingThis = new UsingThis();
    UsingThis.Inner inner = usingThis.new Inner();
    inner.method();
  }
}
