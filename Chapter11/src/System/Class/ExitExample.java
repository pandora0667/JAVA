package System.Class;

/**
 * Created by jusk2 on 2017-02-01.
 */
public class ExitExample {
  public static void main(String[] args) {
    //보안관리자 설정
    System.setSecurityManager(new SecurityManager() {
      @Override
      public void checkExit(int status) {
        if (status != 5)
          throw new SecurityException();
      }

    });

    for (int i=0; i<10; i++) {
      System.out.println(i);
      try {
        System.exit(i);
      } catch (SecurityException e) {}
    }
  }
}
