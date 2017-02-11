package Chapter11.Example;

/**
 * Created by jusk2 on 2017-02-11.
 */
public class BytesToStringExample {
  public static void main(String[] args) {
    byte[] bytes = {72, 32, 108, 111, 118, 101, 32, 121, 111, 117};
    String str = new String(bytes, 0, bytes.length);
    // String str = new String(bytes);
    System.out.println(str);
  }
}
