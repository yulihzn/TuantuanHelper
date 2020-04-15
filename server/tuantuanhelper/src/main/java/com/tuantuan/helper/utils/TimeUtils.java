package com.tuantuan.helper.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
    public static String getSimpleFormatTime(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = format.format(date);
        return dateStr;
    }
    public static String getSimpleFormatTime(){
        return getSimpleFormatTime(new Date());
    }
}
