package com.interview.design.abstractFactory;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Auther: gaoti
 * @Date: 2018/10/23 11:33
 * @Description:
 */
public class OracleOperateUser implements IUser {

    @Override
    public void addUser(User user) {
        System.out.println("使用Oracle 新增用户！");
    }

    @Override
    public void deleteUser(User user) {
        System.out.println("使用Oracle 删除用户！");
    }
}
