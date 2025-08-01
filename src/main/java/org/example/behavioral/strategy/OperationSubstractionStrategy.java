package org.example.behavioral.strategy;

public class OperationSubstractionStrategy implements OperationStrategy{
    @Override
    public int doOperation(int x, int y) {
        return x-y;
    }
}
