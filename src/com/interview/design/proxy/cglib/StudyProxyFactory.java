package com.interview.design.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 11:13 2019/1/11
 */
public class StudyProxyFactory implements MethodInterceptor {


    private Object target;

    public Object getInstance(Object target){
        this.target = target;

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object object, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("小明呀，快高考了，你爸妈让我劝你好好学习");
        Object obj = method.invoke(target,objects);
        System.out.println("中介的任务完成了");
        return obj;
    }
}
