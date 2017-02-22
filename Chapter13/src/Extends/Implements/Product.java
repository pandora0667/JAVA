package Extends.Implements;

/**
 * Created by jusk2 on 2017-02-23.
 */
public class Product<T, M> {
  private T kind;
  private M model;

  public T getKind() {
    return kind;
  }

  public M getModel() {
    return model;
  }

  public void setKind(T kind) {
    this.kind = kind;
  }

  public void setModel(M model) {
    this.model = model;
  }
}

class Tv {}
