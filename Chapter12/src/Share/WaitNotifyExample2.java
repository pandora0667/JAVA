package Share;

/**
 * Created by jusk2 on 2017-02-20.
 */

public class WaitNotifyExample2 {
  public static void main(String[] args) {
    DataBox dataBox = new DataBox();

    ProducerThread producerThread = new ProducerThread(dataBox);
    ConsumerThread consumerThread = new ConsumerThread(dataBox);

    producerThread.start();
    consumerThread.start();
  }
}
