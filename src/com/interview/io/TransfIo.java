package com.interview.io;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * @Auther: gaoti
 * @Date: 2018/11/22 14:53
 * @Description:
 */
public class TransfIo {

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(new File("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        String str = "abc";
        DataInputStream dataInputStream;
        dataInputStream = new DataInputStream(new FileInputStream(new File("text.txt")));
        ArrayList<String> list = new ArrayList<>();
        list.set(2,"str");
        String[] strArr = {"a","b","c"};
    }

}
