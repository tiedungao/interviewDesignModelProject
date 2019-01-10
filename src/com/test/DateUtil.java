package com.test;

import java.util.Date;

/**
 * @Auther: gaoti
 * @Date: 2018/11/11 21:53
 * @Description:
 */
public class DateUtil {
    private static DateUtil dateUtil;
    private  DateUtil(){
    }

    public static DateUtil getDateUtil(){
        if (dateUtil == null) {
            dateUtil = new DateUtil();
        }
        return dateUtil;
    }

    private Date date;

    public String getCurrentDate(){
        date = new Date();
        System.out.println(date.toString());
        return  date.toString();
    }

}
