package org.jusk2.practicejava;

/**
 * Created by jusk2 on 2017-01-11.
 */
public class BankAccount {

  //filed
  private String ano;
  private String owner;
  private int balance;

  static final int MIN_BALANCE = 0;

  //Constructor
  public BankAccount(String ano, String owner, int balance) {
    this.ano = ano;
    this.owner = owner;
    this.balance = balance;
  }

  //Method
  public String getAno() {
    return ano;
  }

  public String getOwner() {
    return owner;
  }

  public int getBalance() {
    return balance;
  }

  public boolean setBalance(boolean type, int balance) {
    if (balance < MIN_BALANCE) {
      return false;
    }

    if (type == true) { // true -> 입금, false -> 출금
      this.balance += balance;
    } else {
      if ((this.balance -= balance) < MIN_BALANCE) {
        this.balance += balance;
        return false;
      }
    }
    return true;
  }
}
