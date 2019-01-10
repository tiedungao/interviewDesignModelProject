package com.interview.design.strategy.detailsStrategy;

import com.interview.design.strategy.StrategyEntity;

import java.math.BigDecimal;

public class StrategyDiscount extends StrategyEntity {

    private Double discount;

    public StrategyDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public Double getResult(Double money) {
        Double result = BigDecimal.valueOf(money).multiply(BigDecimal.valueOf(discount)).setScale(2).doubleValue();
        return result;
    }
}
