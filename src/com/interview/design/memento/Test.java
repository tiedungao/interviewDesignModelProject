package com.interview.design.memento;

/**
 * @Auther: gaoti
 * @Date: 2018/10/24 15:58
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        GamePlayer gamePlayer = new GamePlayer();
        gamePlayer.initState();
        gamePlayer.stateDisplay();

        RoleStateCareTaker roleStateCareTaker = new RoleStateCareTaker();
        roleStateCareTaker.setRoleStateMemento(gamePlayer.saveState());
        gamePlayer.stateDisplay();

        gamePlayer.defentBoss();
        gamePlayer.stateDisplay();

        gamePlayer.recoverState(roleStateCareTaker.getRoleStateMemento());
        gamePlayer.stateDisplay();


    }
}
