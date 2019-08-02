package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        sortThreeNumbers(a, b, c);
    }

    private static void sortThreeNumbers(int a, int b, int c) {
        int max = maxOfNumbers(a, b, c);
        int min = minOfNumbers(a, b, c);
        int sum = (a + b + c);
        int mid = sum - (max + min);
        System.out.println(max + " " + mid + " " + min);
    }

    private static int maxOfNumbers(int a, int b, int c) {
        if (a >= b && a >= c)
            return a;
        else if (b >= a && b >= c)
            return b;
        else
            return c;
    }

    private static int minOfNumbers(int a, int b, int c) {
        if (a <= b && a <= c)
            return a;
        else if (b <= a && b <= c)
            return b;
        else
            return c;
    }
}
