package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(reader.readLine());

        SimpleDateFormat mFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        String outDate = mFormat.format(date);
        System.out.println(outDate.toUpperCase());
    }
}
