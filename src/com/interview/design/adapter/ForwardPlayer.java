package com.interview.design.adapter;

/**
 * @Auther: gaoti
 * @Date: 2018/10/23 17:39
 * @Description:
 */
public class ForwardPlayer extends Player{

    public ForwardPlayer(String name) {
        super(name);
    }

    public void attack(){
        System.out.println("前锋："+this.getName()+"进攻");
    }

    public void defense(){
        System.out.println("前锋:"+this.getName()+"防御");
    }

}
