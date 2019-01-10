package com.interview.design.abstractFactory;

/**
 * @Auther: gaoti
 * @Date: 2018/10/23 11:28
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        IFactory factory = new SqlServerOperateFactory();
        IUser userOperater = factory.createOperateUser();
        User user = new User();
        userOperater.addUser(user);
    }

}
