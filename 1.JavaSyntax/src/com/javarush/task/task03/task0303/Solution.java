package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(450, 1.3));
        System.out.println(convertEurToUsd(8530, 1.25));
    }

    public static double convertEurToUsd(int eur, double course) {
        double dollar = eur * course;
        return dollar;
    }
}
