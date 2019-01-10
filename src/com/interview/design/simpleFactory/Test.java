package com.interview.design.simpleFactory;

public class Test {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        double result = operation.getResult(1.00, 2.00);
        System.out.println(result);
    }
}
