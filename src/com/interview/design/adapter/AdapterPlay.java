package com.interview.design.adapter;

/**
 * @Auther: gaoti
 * @Date: 2018/10/23 17:46
 * @Description:
 */
public class AdapterPlay extends Player{
    ForeignCenterPlayer foreignCenterPlayer ;
    public AdapterPlay(String name) {
        super(name);
        foreignCenterPlayer = new ForeignCenterPlayer();
    }

    @Override
    public void attack() {
        foreignCenterPlayer.ForeignCenterAttack(super.getName());
    }

    @Override
    public void defense() {
        foreignCenterPlayer.ForeignCenterDefense(super.getName());
    }

}
