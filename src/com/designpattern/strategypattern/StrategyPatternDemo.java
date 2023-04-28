package com.designpattern.strategypattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        /*
        Strategy pattern is used when we have multiple algorithm
        for a specific task and client decides the actual implementation to be used at runtime.
         */
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
