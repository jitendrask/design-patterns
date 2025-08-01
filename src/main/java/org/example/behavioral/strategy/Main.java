package org.example.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Context contextAdd = new Context(new OperationAddStrategy());
        Context contextSub = new Context(new OperationSubstractionStrategy());
        int x = 10;
        int y = 5;

        System.out.println(contextAdd.doExecuteStrategy(x,y));
        System.out.println(contextSub.doExecuteStrategy(x,y));
    }
}
