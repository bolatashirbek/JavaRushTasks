package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static final int SECONDS_IN_MINUTE = 60;
    public static final int MINUTES_IN_HOUR = 60;

    public static int convertToSeconds(int hour) {
        int seconds = hour * MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
        return seconds;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(2));
        System.out.println(convertToSeconds(5));
    }
}
