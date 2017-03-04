package Chapter13.Example;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class Container2<K, V> {
  private K key;
  private V value;

  public void set(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }
}
