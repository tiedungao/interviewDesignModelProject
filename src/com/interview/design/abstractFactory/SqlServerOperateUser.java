package com.interview.design.abstractFactory;

/**
 * @Auther: gaoti
 * @Date: 2018/10/23 11:31
 * @Description:
 */
public class SqlServerOperateUser implements IUser {
    @Override
    public void addUser(User user) {
        System.out.println("使用SQL SERVER 新增用户！");
    }

    @Override
    public void deleteUser(User user) {
        System.out.println("使用SQL SERVER删除用户！");
    }
}
