package com.interview.reflect;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author :gaotiedun
 */
public class GetInstanceMethod {

    //通过new()方法获取对象实例
    private void getInstanceFromNew(){
        Student student = new Student();
        System.out.println("method1:"+student.getClass());
    }

    //通过Class.forName()方法获取对象实例
    private void getInstanceFromMethod2() throws ClassNotFoundException, InstantiationException {
        try {
            Student student = (Student) Class.forName("com.interview.reflect.Student").newInstance();
            System.out.println("method2:" + student.getClass());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    //通过Construct类来创建对象
    private void getInstanceFromMethod3() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        try {
            Constructor<Student> constructor = Student.class.getConstructor();
            Student student = constructor.newInstance();
            System.out.println("method3:"+student.getClass());
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    //通过clone方法获取对象
    private void getInstanceFromMethod4(){
        Nature nature = new Nature("汉族","英语");
        Student student1 = new Student("jack",25,99,"大二",nature);
        Student student2 ;
        try {
            student2 = (Student) student1.clone();
            student1.getNature().setLanguage("俄语");
            student1.getNature().setLanguage("日语");
            System.out.println("student1.nature.language:"+student1.getNature().getLanguage());
            System.out.println("name:"+student2.getName());
            System.out.println("student1.nature.language:"+student2.getNature().getLanguage());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    //通过反序列化创建对象
    private void getInstanceFromMethod5() throws ClassNotFoundException {
        ObjectInputStream is = null;
        try {
            is = new ObjectInputStream(new FileInputStream(new File("E:/student.txt")));
            Student student = (Student) is.readObject();
            System.out.println(student.getName());
            System.out.println("method5:"+student.getClass());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null != is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InstantiationException, ClassNotFoundException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        GetInstanceMethod getInstanceMethod = new GetInstanceMethod();

        getInstanceMethod.getInstanceFromNew();
        getInstanceMethod.getInstanceFromMethod2();
        getInstanceMethod.getInstanceFromMethod3();
        getInstanceMethod.getInstanceFromMethod4();
        getInstanceMethod.getInstanceFromMethod5();
    }
}
