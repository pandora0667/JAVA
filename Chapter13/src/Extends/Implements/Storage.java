package Extends.Implements;

/**
 * Created by jusk2 on 2017-02-23.
 */
public interface Storage<T> {
  public void add(T item, int index);
  public T get(int index);
  }
