package Exception.Balance;

/**
 * Created by jusk2 on 2017-01-26.
 */
public class BalanceInsufficientException extends Exception {
  public BalanceInsufficientException() {}
  public BalanceInsufficientException(String message) {
    super(message);
  }
}
