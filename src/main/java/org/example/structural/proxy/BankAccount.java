package org.example.structural.proxy;

public class BankAccount implements Account{
    @Override
    public int getAccountBalance() {
        return 100;
    }
}
