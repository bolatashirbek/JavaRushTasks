package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        // 1. считываем с консоли число N, потом проверяем: число должно быть больше 0
        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            // 2. потом считываем N чисел с консоли
            for (int i = 0; i < n; i++) {
                int number = Integer.parseInt(reader.readLine());
                // все числа добавляем в список
                list.add(number);
            }
            // 3. выводим на экран максимальное из введенных N чисел.
            int maximum = Collections.max(list);
            System.out.println(maximum);
        }
    }
}
