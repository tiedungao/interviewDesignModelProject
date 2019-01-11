package com.interview.design.proxy;

public class ShoppingProxy implements Shopping {
    private Shopping goodsFactory;

    public ShoppingProxy(Shopping goodsFactory) {
        this.goodsFactory = goodsFactory;
    }

    @Override
    public void buyBag() {
        goodsFactory.buyBag();
    }

    @Override
    public void buyClothes() {
        goodsFactory.buyClothes();
    }

    @Override
    public void buyShoes() {
        goodsFactory.buyShoes();
    }
}
