package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        double div = (double) a / (double) b;
        return div;
    }

    public static double percent(int a, int b) {
        double percent = (a / 100.0) * b;
        return percent;
    }

    public static void main(String[] args) {
        System.out.println(plus(4, 7));
        System.out.println(minus(22, 6));
        System.out.println(multiply(7, 6));
        System.out.println(division(15, 3));
        System.out.println(percent(200, 48));
    }
}