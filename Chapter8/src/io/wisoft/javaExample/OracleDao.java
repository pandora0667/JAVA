package io.wisoft.javaExample;

/**
 * Created by jusk2 on 2017-01-21.
 */
public class OracleDao implements DataAccessObject {

  @Override
  public void select() {
    System.out.println("Oracle DB에서 검색");
  }

  @Override
  public void insert() {
    System.out.println("Oracle DB에서 삽입");
  }

  @Override
  public void update() {
    System.out.println("Oracle DB에서 수정");
  }

  @Override
  public void delete() {
    System.out.println("Oracle DB에서 삭제");
  }

}
