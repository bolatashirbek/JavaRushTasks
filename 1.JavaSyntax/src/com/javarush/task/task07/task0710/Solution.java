package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        // добавляем в начало списка 10 строк из клавиатуры
        for (int i = 0; i < 10; i++) {
            String element = reader.readLine();
            list.add(0, element);
        }

        // выводим содержимое списка
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}