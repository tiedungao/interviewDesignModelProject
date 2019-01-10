package com.interview.design.strategy.detailsStrategy;

import com.interview.design.strategy.StrategyEntity;

public class StrategyNormal extends StrategyEntity {

    @Override
    public Double getResult(Double money) {
        return money;
    }

}
