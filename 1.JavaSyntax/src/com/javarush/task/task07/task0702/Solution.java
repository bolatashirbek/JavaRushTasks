package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];

        // заполняем массив из клавиатуры
        for (int i = 0; i < 8; i++) {
            list[i] = reader.readLine();
        }

        // выводим массив в обратном порядке
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[9 - i]);
        }
    }
}