package com.interview.design.memento;

/**
 * @Auther: gaoti
 * @Date: 2018/10/24 16:14
 * @Description:
 */
public class RoleStateCareTaker {

    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
