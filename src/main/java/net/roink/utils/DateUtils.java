package net.roink.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

    /**
     * java.util.Date 转换为String
     * @param date
     * @return
     */
    public static String utilToStr(java.util.Date date){

        return sdf.format(date);
    }

    /**
     * String 转换为java.util.Date
     * @param date
     * @return
     */
    public static java.util.Date strToDate(String date) {
        try {
            Date parse = sdf.parse(date);
            return parse;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * java.util.Date 转换为java.sql.Date
     * @param utilDate
     * @return
     */
    public static java.sql.Date utilToSql(java.util.Date utilDate) {
       return new java.sql.Date(utilDate.getTime());
    }


}
