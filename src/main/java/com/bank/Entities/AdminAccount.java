package com.bank.Entities;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public final class AdminAccount extends UserAccount {

  public AdminAccount() {}

  public AdminAccount(String username, String password) {
    super(username, password);
  }

  public UserAccount createUser() {
    Scanner input = new Scanner(System.in);

    System.out.println("Username for the new user account: ");
    String username = input.nextLine();

    System.out.println("Password for the new user account: ");
    String password = input.nextLine();

    input.close();

    return new UserAccount(username, password);
  }
}
