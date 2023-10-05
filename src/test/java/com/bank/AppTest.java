package com.bank;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.bank.Entities.UserAccount;

public class AppTest {

    static UserAccount user;

    @BeforeClass
    public static void setUp() {
        user = new UserAccount("Julian", "Pass123");
    }

    @Test
    public void testIncorrectWithdraw() {
        user.withdraw(500d);
        double balance = user.getBalance();

        assertEquals("Balance should mantain in 0", 0d, balance, 0.001);
    }

    @Test
    public void testDeposit() {
        user.deposit(1000d);
        double balance = user.getBalance();


        assertEquals("Balance should be 1000", 1000d, balance, 0.001);
    }

    @Test
    public void testCorrectWithdraw() {
        user.withdraw(500d);
        double balance = user.getBalance();


        assertEquals("Balance should be 500", 500d, balance, 0.001);
    }
}
