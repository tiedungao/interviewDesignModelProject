package com.interview.javaBase;


import java.util.*;

/**
 * @Auther: gaoti
 * @Date: 2018/11/19 20:46
 * @Description:
 */
public class EntrySet {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("关注公众号:", "Java3y");
        hashMap.put("坚持原创", "Java3y");
        entrySetIterator(hashMap);
        keySetIterator(hashMap);
        hashMapForeach(hashMap);
    }

    public static void entrySetIterator(HashMap<String,String> hashMap){
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> it = entrySet.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> items = it.next();
            items.getKey();
            System.out.println("Map当前的Key值为:"+items.getKey()+"Map当前的Value值为："+items.getValue());
        }

    }

    public static void keySetIterator(HashMap<String,String> hashMap){
        Set<String> set = hashMap.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println("Map的KEY:"+key+"Map对应的Value值为:"+hashMap.get(key));
        }
    }

    public static void hashMapForeach(HashMap<String, String> hashMap){
        hashMap.forEach((key,value)-> System.out.println("key:"+key+",value:"+value));
    }


}
