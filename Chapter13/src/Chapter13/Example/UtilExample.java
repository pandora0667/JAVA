package Chapter13.Example;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class UtilExample {
  public static void main(String[] args) {
    Pair<String, Integer> pair = new Pair<>("이성원", 24);
    Integer age = Util.getValue(pair, "이성원");
    System.out.println(age);

    ChildPair<String, Integer> childPair = new ChildPair<>("이성원", 24);
    Integer childAge = Util.getValue(childPair, "이소원");
    System.out.println(childAge);
  }
}
