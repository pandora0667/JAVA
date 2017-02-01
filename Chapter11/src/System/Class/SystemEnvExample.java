package System.Class;

/**
 * Created by jusk2 on 2017-02-02.
 */
public class SystemEnvExample {
  public static void main(String[] args) {
    String javaHome = System.getenv("JAVA_HOME");
    System.out.println("JAVA_HOME : " + javaHome);
  }
}
