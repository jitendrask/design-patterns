package org.example.structural.proxy;

public class AtmProxy implements Account{
    @Override
    public int getAccountBalance() {
        BankAccount bankAccount = new BankAccount();
        return bankAccount.getAccountBalance();
    }
}
