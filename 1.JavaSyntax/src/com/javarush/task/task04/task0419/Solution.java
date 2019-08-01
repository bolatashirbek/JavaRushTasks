package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());
        int third = Integer.parseInt(reader.readLine());
        int fourth = Integer.parseInt(reader.readLine());
        maximumOfFourNumbers(first, second, third, fourth);
    }

    // 1-вариант решения: с помощью if else
    private static void maximumOfFourNumbers(int first, int second, int third, int fourth) {
        if ((first >= second) && (first >= third) && (first >= fourth))
            System.out.println(first);
        else if ((second > first) && (second > third) && (second > fourth))
            System.out.println(second);
        else if ((third > first) && (third > second) && (third > fourth))
            System.out.println(third);
        else
            System.out.println(fourth);
    }

    // 2-вариант решения: с помощью java.util.Collections. Они так и называются: max и min.
    private static void maximumOfFourNumbers2(int first, int second, int third, int fourth) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(first);
        list.add(second);
        list.add(third);
        list.add(fourth);
        System.out.println(Collections.max(list));
    }

    // 3-вариант решения: с помощью Math.max()
    private static void maximumOfFourNumbers3(int first, int second, int third, int fourth) {
        int max1 = Math.max(first, second);
        int max2 = Math.max(third, fourth);
        int totalMax = Math.max(max1, max2);
        System.out.println(totalMax);
    }
}
