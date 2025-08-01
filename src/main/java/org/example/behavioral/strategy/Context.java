package org.example.behavioral.strategy;

public class Context {
    private OperationStrategy operationStrategy;
    public Context(OperationStrategy operationStrategy){
        this.operationStrategy = operationStrategy;
    }
    public int doExecuteStrategy(int x, int y){
        return operationStrategy.doOperation(x,y);
    }
}
