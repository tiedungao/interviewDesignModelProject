package com.interview.design.memento;

/**
 * @Auther: gaoti
 * @Date: 2018/10/24 15:46
 * @Description:
 */
public class RoleStateMemento {
    private Integer vit;
    private Integer atk;
    private Integer def;

    public RoleStateMemento(int vit ,int atk,int def){
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public Integer getVit() {
        return vit;
    }

    public void setVit(Integer vit) {
        this.vit = vit;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }
}
