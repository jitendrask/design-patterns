package org.example.behavioral.strategy;

public class OperationAddStrategy implements OperationStrategy {
    @Override
    public int doOperation(int x, int y) {
        return Integer.sum(x,y);
    }
}
