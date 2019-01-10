package com.interview.design.strategy;

public class Test {
    public static void main(String[] args) {
        double price = 1.2;
        double number = 3.0;
        Double result;

        StrategyContext sc = new StrategyContext("normal");     //策略模式
        result = sc.getResult(price, number);
    }
}
