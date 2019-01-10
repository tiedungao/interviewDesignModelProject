package com.interview.design.adapter;

/**
 * @Auther: gaoti
 * @Date: 2018/10/23 17:56
 * @Description:
 */
public class TestPlayer {

    public static void main(String[] args) {
        Player forwardPlayer = new ForwardPlayer("巴蒂尔");
        forwardPlayer.attack();
        forwardPlayer.defense();
        Player guardPlayer = new GuardPlayer("麦克格雷迪");
        guardPlayer.attack();
        guardPlayer.defense();

        Player centerPlayer = new AdapterPlay("姚明");
        centerPlayer.attack();
        centerPlayer.defense();

    }
}
