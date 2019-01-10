package com.interview.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author : gaotiedun
 * @deprecated
 */
public class CallMethod {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Student> cls = Student.class;
        try {
            Method method = cls.getMethod("getScoreGrade");
            //Constructor<Student> constructor = cls.getConstructor(String.class,int.class,int.class);
            //Student student = constructor.newInstance("jack",22);
            String result = (String) method.invoke(cls.getConstructor(String.class,int.class,int.class).newInstance("gaotiedun",22,90));
            System.out.println(result);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
