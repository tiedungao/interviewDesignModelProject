package com.interview.reflect;

/**
 * @Auther: gaoti
 * @Date: 2018/11/19 16:43
 * @Description:
 */
public class ReflectMethod {
    //通过对象的getClass方法
    public void getClassFromReflect1(){
        Class cls = new Student().getClass();
        System.out.println("method1:"+cls);
    }
    //通过类的class方法
    public void getClassFromReflect2(){
        Class cls = Student.class;
        System.out.println("method2:"+cls);
    }

    //通过Class.forName()
    public void getClassFromReflect3(){
        try {
            Class cls = Class.forName("com.interview.reflect.Student");
            System.out.println("method3:"+cls);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //通过类加载器获取
    public void getClassFromReflect4(){
        try {
            Class cls = ReflectMethod.class.getClassLoader().loadClass("com.interview.reflect.Student");
            System.out.println("method4:"+cls);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReflectMethod reflectMethod = new ReflectMethod();

        reflectMethod.getClassFromReflect1();
        reflectMethod.getClassFromReflect2();
        reflectMethod.getClassFromReflect3();
        reflectMethod.getClassFromReflect4();
    }
}
