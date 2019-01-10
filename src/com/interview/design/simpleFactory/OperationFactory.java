package com.interview.design.simpleFactory;


import com.interview.design.simpleFactory.impl.OperationAdd;
import com.interview.design.simpleFactory.impl.OperationDiv;
import com.interview.design.simpleFactory.impl.OperationMul;
import com.interview.design.simpleFactory.impl.OperationSub;
import org.apache.commons.lang.StringUtils;

public class OperationFactory {

    private static Operation operation = null;

    public static Operation createOperation(String symbol) {
        try {
            if (!StringUtils.isNotBlank(symbol)) {
                throw new Exception("传入计算符为空！");
            }
            System.out.println("symbol" + symbol);
            switch (symbol) {
                case "-":
                    operation = new OperationSub();
                    break;
                case "+":
                    operation = new OperationAdd();
                    break;
                case "*":
                    operation = new OperationMul();
                    break;
                case "/":
                    operation = new OperationDiv();
                    break;
            }
            return operation;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return operation;
    }

}
