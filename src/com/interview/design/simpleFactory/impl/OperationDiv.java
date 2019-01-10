package com.interview.design.simpleFactory.impl;

import com.interview.design.simpleFactory.Operation;

public class OperationDiv extends Operation {

    @Override
    public Double getResult(Double operateA, Double operateB) {
        Double result = 0.00;
        try {
            if (operateB == 0) {
                throw new Exception("被除数不能为零！");
            }

            result = operateA / operateB;
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
