package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        double tenPercent, sum;
        tenPercent = i / 10.0;
        sum = i + tenPercent;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
