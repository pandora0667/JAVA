package Chapter11.Example;

/**
 * Created by jusk2 on 2017-02-11.
 */
public class Member {
  private String id;
  private String name;

  public Member(String id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return id + ", " + name;
  }
}
