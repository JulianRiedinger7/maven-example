package com.bank;

import com.bank.Entities.AdminAccount;
import com.bank.Entities.UserAccount;

public class App {
    public static void main(String[] args) {

        AdminAccount admin = new AdminAccount("Admin", "Admin123");

        UserAccount user1 = admin.createUser();

        user1.withdraw(100d);
        user1.deposit(1000d);
        user1.withdraw(500d);
    }
}
