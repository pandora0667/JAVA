package io.wisoft.javaExample;

/**
 * Created by jusk2 on 2017-01-21.
 */
public class DaoExample {

  public static void dbWork(DataAccessObject dao) {
    dao.select();
    dao.insert();
    dao.update();
    dao.delete();
  }

  public static void main(String[] args) {
    dbWork(new OracleDao());
    System.out.println();
    dbWork(new MySqlDao());
  }
}
