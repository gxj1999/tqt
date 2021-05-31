package com.sjasoft.framework.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
    public static String formatDate(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
    public static Date parseDate(String date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(date);
        } catch (ParseException ex) {
            return null;
        }
    }

    public static int diffMonth(Date start, Date end) {
        Calendar bef = Calendar.getInstance();
        Calendar aft = Calendar.getInstance();
        bef.setTime(start);
        aft.setTime(end);
        int result = aft.get(Calendar.MONTH) - bef.get(Calendar.MONTH);
        int month = (aft.get(Calendar.YEAR) - bef.get(Calendar.YEAR)) * 12;
        return month + result;
    }
    /**
     * 计算俩日期相差多少月
     */
    public static int diffMonth(String startTime, String endTime, String format){
        Date startDate = DateUtils.parseDate(startTime, format);
        Date endDate = DateUtils.parseDate(endTime, format);
        if (startDate == null || endDate == null) {
            return 0;
        }
        return diffMonth(startDate, endDate);
    }
}
