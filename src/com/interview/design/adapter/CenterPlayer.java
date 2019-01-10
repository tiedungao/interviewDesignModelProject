package com.interview.design.adapter;

/**
 * @Auther: gaoti
 * @Date: 2018/10/23 17:43
 * @Description:
 */
public class CenterPlayer extends Player {

    public CenterPlayer(String name) {
        super(name);
    }

    public void attack(){
        System.out.println("中锋:"+this.getName()+"进攻");
    }

    public void defense(){
        System.out.println("中锋:"+this.getName()+"防御");
    }

}
