package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("MMMM dd yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sf.parse(date));
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        if (dayOfYear % 2 == 0) {
            return false;
        }
        return true;
    }
}
