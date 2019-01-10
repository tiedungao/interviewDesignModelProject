package com.interview.design.abstractFactory;

/**
 * @Auther: gaoti
 * @Date: 2018/10/23 11:55
 * @Description:
 */
public class SqlServerOperateFactory implements IFactory {

    @Override
    public IUser createOperateUser() {
        return new SqlServerOperateUser();
    }
}
