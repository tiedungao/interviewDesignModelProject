package com.interview.design.simpleFactory.impl;

import com.interview.design.simpleFactory.Operation;

public class OperationSub extends Operation {

    @Override
    public Double getResult(Double operateA, Double operateB) {
        Double result = 0.00;
        result = operateA - operateB;
        return result;
    }
}
