package Consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

/**
 * Created by jusk2 on 2017-03-05.
 */
public class ConsumerExample {
  public static void main(String[] args) {
    Consumer<String> stringConsumer = t -> System.out.println(t + 8);
    stringConsumer.accept("JAVA");

    BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
    biConsumer.accept("JAVA", "8");

    DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
    doubleConsumer.accept(8.0);

    ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
    objIntConsumer.accept("JAVA", 8);
  }
}
