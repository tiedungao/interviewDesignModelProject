package com.interview.design.abstractFactory;

/**
 * @Auther: gaoti
 * @Date: 2018/10/23 11:37
 * @Description:
 */
public class OracleOperateFactory implements IFactory {
    @Override
    public IUser createOperateUser() {
        return new OracleOperateUser();
    }
}
