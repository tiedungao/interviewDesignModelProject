package com.interview.design.simpleFactory.impl;

import com.interview.design.simpleFactory.Operation;

public class OperationAdd extends Operation {


    @Override
    public Double getResult(Double operateA, Double operateB) {
        Double result = 0.00;
        System.out.println("run here");
        result = operateA + operateB;
        return result;
    }
}
