package System.Class;

import java.util.Properties;
import java.util.Set;

/**
 * Created by jusk2 on 2017-02-02.
 */
public class GetPropertyExample {
  public static void main(String[] args) {
    String osName = System.getProperty("os.name");
    String userName = System.getProperty("user.name");
    String userHome = System.getProperty("user.home");

    System.out.println("OS : " + osName);
    System.out.println("User Name : " + userName);
    System.out.println("User Home Directory : " + userHome);

    System.out.println("-----------------------------------");
    System.out.println("          [ key ]  value");
    System.out.println("-----------------------------------");

    Properties properties = System.getProperties();
    Set keys = properties.keySet();

    for (Object objKey : keys) {
      String key = (String) objKey;
      String value = System.getProperty(key);
      System.out.println("[ " + key + " ]" + value);
    }
  }
}
