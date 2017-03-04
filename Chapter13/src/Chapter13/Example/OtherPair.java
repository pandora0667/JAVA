package Chapter13.Example;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class OtherPair<K, V> {
  private K key;
  private V value;

  public OtherPair(K key, V value) {
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
