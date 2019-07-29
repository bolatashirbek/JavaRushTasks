package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    // Решение с использованием массива
    public static int sumDigitsInNumber(int number) {
        String[] array = Integer.toString(number).split("");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Integer.parseInt(array[i]);
        }
        return sum;
    }
}