package com.interview.reflect;

import java.io.*;

/**
 * @Auther: gaoti
 * @Date: 2018/11/19 17:21
 * @Description:
 */
public class PersonSerializable {

    public void serializable(){
        Nature nature = new Nature("汉族","汉语");
        Student student = new Student("gaotiedun",25,98,"大一",nature);
        ObjectOutputStream ops = null;
        try {
            ops = new ObjectOutputStream(new FileOutputStream(new File("E:/student.txt")));
            ops.writeObject(student);
            System.out.println("序列化Student对象成功！");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(null != ops){
                try {
                    ops.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) {
        PersonSerializable personSerializable = new PersonSerializable();
        personSerializable.serializable();

    }

    private void writeObject(ObjectOutputStream o)throws IOException{
        o.defaultWriteObject();
    }

}
