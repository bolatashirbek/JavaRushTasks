package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(filename);
        int[] array = new int[256];

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            array[data] += 1;
        }
        fileInputStream.close();
        reader.close();

        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) maxValue = array[i];
        }
        // Получение максимального элемента через stream
        //int maxValue = Arrays.stream(array).max().getAsInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue) System.out.print(i + " ");
        }
    }
}
