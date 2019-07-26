package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) throws ParseException {
        String time1 = "15:00:00";
        String time2 = "15:30:00";

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date date1 = format.parse(time1);
        Date date2 = format.parse(time2);
        long secondsAfter15 = (date2.getTime() - date1.getTime()) / 1000;

        System.out.println(secondsAfter15);
    }
}