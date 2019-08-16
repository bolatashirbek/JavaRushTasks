package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        // ввели с клавиатуры 2 числа N и M
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        // ввести N строк и заполнить ими список
        for (int i = 0; i < n; i++) {
            strings.add(reader.readLine());
        }

        // переставим M первых строк в конец списка
        int check = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (check < m) {
                String tmp = strings.get(i);
                strings.add(tmp);
                strings.remove(tmp);
                check++;
                i--;
            }
        }

        // выводим список на экран, каждое значение с новой строки
        for (String elem : strings) System.out.println(elem);
    }
}
