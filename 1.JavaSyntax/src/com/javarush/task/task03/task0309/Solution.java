package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        getSum(5);
    }

    public static void getSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
}
