package com.interview.javaBase;

import com.interview.reflect.Student;

import java.lang.reflect.InvocationTargetException;

/**
 * @Auther: gaoti
 * @Date: 2018/11/19 21:40
 * @Description:
 */
public class ArrayInsert {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[0] = "I";
        str[1] = "L";
        str[2] = "O";
        str[3] = "V";
        str[4] = "E";
        str[5] = "Y";
        str[6] = "O";
        str[7] = "U";
        str[8] = "F";
        str[9] = "O";
        Thread thread;
        thread = Thread.currentThread();
        try {
            Class cls = thread.getContextClassLoader().loadClass("com.interview.reflect.Student");
            Student student = (Student) cls.getConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(str.toString());
    }
}
