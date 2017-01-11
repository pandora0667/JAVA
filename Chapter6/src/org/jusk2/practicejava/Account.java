package org.jusk2.practicejava;

/**
 * Created by jusk2 on 2017-01-11.
 */
public class Account {

  //filed
  int balance;
  static final int MIN_BALANCE = 0;
  static final int MAX_BALANCE = 1000000;

  public void setBalance(int balance) {
    if (balance < MIN_BALANCE || balance > MAX_BALANCE) {
      return;
    } else {
      this.balance += balance;
    }
  }

  public int getBalance() {
    return this.balance;
  }
}
