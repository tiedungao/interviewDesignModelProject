package com.interview.design.proxy.dynamicProxy;

import com.interview.collection.ArrayListRemove;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/**
 * @Author: gtd
 * @Description:
 * @Date: Create in 0:19 2019/1/11
 */
public class Tenant {

    public static void main(String[] args) {
        LandLord landLord = new LandLord();
        //由JDK通过反射去创建代理角色
        //获取类加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        //获取被代理类实现的接口数组
        Class[] interfaces = landLord.getClass().getInterfaces();
        //获取代理类对象
        Renting proxy = (Renting) Proxy.newProxyInstance(classLoader,interfaces,
                (Object target, Method method, Object[] params)->{ //此处由于实现比较简单，所以使用Lambda表达式
                    System.out.println("我是代理，我去找房东");
                    Object obj = method.invoke(landLord,params);
                    System.out.println("代理任务完成");
                    return obj;
                });

        System.out.println("我想租房，并联系代理");
        proxy.rentOut();
    }

}
