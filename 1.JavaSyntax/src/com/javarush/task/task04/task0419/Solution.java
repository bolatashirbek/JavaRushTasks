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
}
