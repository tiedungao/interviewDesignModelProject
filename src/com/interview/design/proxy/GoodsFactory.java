package com.interview.design.proxy;

/**
 * @Author: 高铁墩
 * @Description:
 * @Date: Create in 17:37 2019/1/10
 */
public class GoodsFactory implements Shopping {


    @Override
    public void buyBag() {
        System.out.println("生产了一个包");
        System.out.println("包包已经寄出");
    }

    @Override
    public void buyClothes() {
        System.out.println("生产了一件衣服");
        System.out.println("衣服已经寄出");
    }

    @Override
    public void buyShoes() {
        System.out.println("生产了一双鞋子");
        System.out.println("鞋子已经寄出");
    }
}
