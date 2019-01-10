package com.interview.design.bridge;

/**
 * @Auther: gaoti
 * @Date: 2018/10/24 23:28
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        MobileGame meikoMobileGame = new MeikoMobileGame();
        meikoMobileGame.playGames();

        MobileGame honorMobileGame = new HonorMobileGame();
        honorMobileGame.playGames();


    }

}
