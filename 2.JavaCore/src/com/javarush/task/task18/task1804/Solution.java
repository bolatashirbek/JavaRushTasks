package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(reader.readLine())) {
            int[] array = new int[256];
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                array[data]++;
            }
            int minValue = Integer.MAX_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < minValue && array[i] != 0) minValue = array[i];
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] == minValue) System.out.print(i + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
