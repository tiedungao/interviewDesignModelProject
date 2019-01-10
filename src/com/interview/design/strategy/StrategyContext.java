package com.interview.design.strategy;

import com.interview.design.strategy.detailsStrategy.StrategyDiscount;
import com.interview.design.strategy.detailsStrategy.StrategyMoneyOff;
import com.interview.design.strategy.detailsStrategy.StrategyNormal;

import java.math.BigDecimal;

public class StrategyContext {

    private StrategyEntity se;

    public StrategyContext(String type) {

        switch (type) {
            case "normal":
                this.se = new StrategyNormal();
                break;
            case "discount":
                this.se = new StrategyDiscount(0.80);
                break;
            case "moneyOff":
                this.se = new StrategyMoneyOff(300.00, 20.00);
                break;
        }


        this.se = se;
    }

    public Double getResult(Double price, Double number) {
        BigDecimal result = BigDecimal.valueOf(price).multiply(BigDecimal.valueOf(number)).setScale(2);
        return se.getResult(result.doubleValue());
    }

}
