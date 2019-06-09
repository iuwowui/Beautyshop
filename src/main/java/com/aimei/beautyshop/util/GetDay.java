package com.aimei.beautyshop.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDay {
    /**
     16      * 指定日期加上天数后的日期
     17      * @param num 为增加的天数
     18      * @param newDate 创建时间
     19      * @return
     20      * @throws ParseException
     21      */
    public static String plusDay(int num,String newDate) throws ParseException {
               SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date currdate = format.parse(newDate);

                 Calendar ca = Calendar.getInstance();
                 ca.add(Calendar.DATE, num);// num为增加的天数，可以改变的
                 currdate = ca.getTime();
                 String enddate = format.format(currdate);

                 return enddate;
            }

}
