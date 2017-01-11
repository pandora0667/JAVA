package org.jusk2.practicejava;

import java.util.Scanner;

/**
 * Created by jusk2 on 2017-01-11.
 */
public class BankApplication {
  private static BankAccount[] accountArray = new BankAccount[100];
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    boolean run = true;
    while (run) {
      System.out.println("--------------------------------------------------");
      System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
      System.out.println("--------------------------------------------------");

      System.out.print("선택 > ");
      int selectNumber = scanner.nextInt();

      switch (selectNumber) {
        case 1:
          createAccount();  // 계좌생성
          break;

        case 2:
          accountList(); // 계좌목록
          break;

        case 3:
          deposit(); // 예금
          break;

        case 4:
          withdraw(); // 출금
          break;

        case 5:
          run = false;
          break;

        default:
          System.out.println("잘못 입력했습니다. 다시 입력하세요");
      }
    }
  }


  private static void createAccount() {

    System.out.println("----------");
    System.out.println(" 계좌생성 ");
    System.out.println("----------");

    System.out.print("계좌번호 : ");
    String ano = scanner.next();

    System.out.print("계좌주 : ");
    String owner = scanner.next();

    boolean confirm = findAccount(ano, owner);
    if (confirm) {
      System.out.print("초기 입금엑 : ");
      int balance = scanner.nextInt();
      System.out.println();

      BankAccount newAccount = new BankAccount(ano, owner, balance);

      for (int i = 0; i < accountArray.length; i++) {
        if (accountArray[i] == null) {
          accountArray[i] = newAccount;
          System.out.println("계좌생성이 완료되었습니다.");
          return;
        }
      }
    } else {
      System.out.println("계좌가 이미 존재합니다.");
      return;
    }
  }

  private static void accountList() {

    System.out.println("------------");
    System.out.println(" 계좌리스트 ");
    System.out.println("------------");

    for (int i = 0; i < accountArray.length; i++) {
      BankAccount account = accountArray[i];

      if (account != null) {
        System.out.print(account.getAno());
        System.out.print("    ");

        System.out.print(account.getOwner());
        System.out.print("    ");

        System.out.print(account.getBalance());
        System.out.println();
      }
    }
  }

  private static void deposit() {
    System.out.println("----------");
    System.out.println("   예금   ");
    System.out.println("----------");

    System.out.print("계좌번호 : ");
    String ano = scanner.next();

    BankAccount account = findAccount(ano); // 계좌검색
    if (account == null) {
      System.out.println("계좌번호가 존재하지 않습니다.");
      return;
    }

    System.out.print("입금액 : ");
    int money = scanner.nextInt();
    boolean confirm = account.setBalance(true, money);
    if (confirm) {
      System.out.println("----- 정상적으로 입금되었습니다.-----");
      System.out.println("----- 잔액 : " + account.getBalance() + " -----");
      System.out.println();
    } else
      System.out.println("입금액이 마이너스가 될 수 없습니다.");
  }

  private static void withdraw() {
    System.out.println("----------");
    System.out.println("   출금   ");
    System.out.println("----------");

    System.out.print("계좌번호 : ");
    String ano = scanner.next();

    BankAccount account = findAccount(ano); // 계좌검색
    if (account == null) {
      System.out.println("계좌번호가 존재하지 않습니다.");
      return;
    }

    System.out.print("출금액 : ");
    int money = scanner.nextInt();
    boolean confirm = account.setBalance(false, money);

    if (confirm) {
      System.out.println("----- 정상적으로 출금되었습니다.-----");
      System.out.println("----- 잔액 : " + account.getBalance() + " -----");
    } else
      System.out.println("잔액이 부족하거나, 잘못 입력되었습니다.");
  }

  private static BankAccount findAccount(String ano) {
    BankAccount account = null;

    for (int i = 0; i < accountArray.length; i++) {
      if (accountArray[i] != null)
        if (ano.equals(accountArray[i].getAno())) {
          account = accountArray[i];
          break;
        }
    }
    return account;
  }

  // 계좌 개설시 같은 계좌가 존재하는지 확인
  private static boolean findAccount(String ano, String owner) {

    for (int i = 0; i < accountArray.length; i++) {
      if (accountArray[i] != null)
        if (ano.equals(accountArray[i].getAno())) {
          return false;
        }
    }
    return true;
  }
}


