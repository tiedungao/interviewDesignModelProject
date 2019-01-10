package com.interview.design.memento;

/**
 * @Auther: gaoti
 * @Date: 2018/10/24 15:29
 * @Description:
 */
public class GamePlayer {
    private Integer vit;
    private Integer atk;
    private Integer def;

    public void initState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit,atk,def);
    }

    public void stateDisplay(){
        System.out.println("VIT="+this.vit+";ATK="+this.atk+";DEF="+this.def);
    }

    public void recoverState(RoleStateMemento roleStateMemento){
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

    public void defentBoss(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

}
