package com.interview.design.adapter;

/**
 * @Auther: gaoti
 * @Date: 2018/10/23 17:36
 * @Description:
 */
public abstract class Player {
    private String name;
    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();
}
