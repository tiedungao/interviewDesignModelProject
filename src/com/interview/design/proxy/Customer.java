package com.interview.design.proxy;

public class Customer {

    public static void main(String[] args) {
        Shopping proxy = new ShoppingProxy(new GoodsFactory());

        System.out.println("我要买双个包");
        proxy.buyBag();

        System.out.println("我要买件衣服");
        proxy.buyClothes();

        System.out.println("我要买双鞋子");
        proxy.buyShoes();
    }

}
