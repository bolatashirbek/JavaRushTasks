package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream fis = new FileInputStream(filename);

        int minByte = Integer.MAX_VALUE;
        while (fis.available() > 0) {
            int data = fis.read();
            if (data < minByte) {
                minByte = data;
            }
        }
        fis.close();
        reader.close();
        System.out.println(minByte);
    }
}
