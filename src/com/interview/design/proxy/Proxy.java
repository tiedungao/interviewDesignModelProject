package com.interview.design.proxy;

public class Proxy implements Shopping {
    private Shopping goodsFactory;

    public Proxy(Shopping goodsFactory) {
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
