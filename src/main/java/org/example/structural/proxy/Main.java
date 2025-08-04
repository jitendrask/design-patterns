package org.example.structural.proxy;

public class Main {
    public static void main(String[] args) {
        /*
        AtmProxy is Account
        AtmProxy have BankAccount
        Similar way other proxies can be created as per requirement
         */
        AtmProxy atmProxy = new AtmProxy();
        System.out.println(atmProxy.getAccountBalance());
    }
}
