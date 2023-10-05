package com.bank.Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserAccount {
  protected String username, password;
  protected Double balance;

  public UserAccount() {
  }

  public UserAccount(String username, String password) {
    this.username = username;
    this.password = password;
    this.balance = 0d;
  }

  public void showBalance() {
    System.out.println(username + " now has a balance of: $" + balance);
  }

  public void deposit(double quantity) {
    this.balance += quantity;
    showBalance();
  }

  public void withdraw(double quantity) {
    if (balance >= quantity) {
      this.balance -= quantity;

      System.out.println(username + " has withdraw $" + quantity);
      showBalance();
    } else {
      System.out.println(username + " does not have enough balance");
    }
  }

}
