package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int max = Math.max(Math.max(a, b), Math.max(b, c));
        int min = Math.min(Math.min(a, b), Math.min(b, c));
        int sum = (a + b + c);
        int mid = sum - (max + min);
        System.out.println(mid);
    }
}
