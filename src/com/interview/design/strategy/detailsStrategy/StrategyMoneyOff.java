package com.interview.design.strategy.detailsStrategy;

import com.interview.design.strategy.StrategyEntity;

public class StrategyMoneyOff extends StrategyEntity {

    private Double overMoney;
    private Double offMoney;

    public StrategyMoneyOff(Double overMoney, Double offMoney) {
        this.overMoney = overMoney;
        this.offMoney = offMoney;
    }

    @Override
    public Double getResult(Double money) {
        Double result = 0.00;
        if (money >= offMoney) {
            result = result - offMoney;
        }
        return result;
    }

}
