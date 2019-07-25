package com.javarush.task.task03.task0314;

/* 
Таблица умножения используя цикл while
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int k = 1;
            while (k <= 10) {
                System.out.print(i * k + " ");
                k++;
            }
            i++;
            System.out.println();
        }
    }
}
