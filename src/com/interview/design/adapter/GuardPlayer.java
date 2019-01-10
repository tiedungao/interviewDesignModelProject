package com.interview.design.adapter;

/**
 * @Auther: gaoti
 * @Date: 2018/10/23 17:44
 * @Description:
 */
public class GuardPlayer extends Player {
    public GuardPlayer(String name) {
        super(name);
    }

    public void attack(){
        System.out.println("后卫:"+this.getName()+"进攻");
    }

    public void defense(){
        System.out.println("后卫:"+this.getName()+"防御");
    }
}
