package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        BufferedReader readerFile = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        List<Integer> numbers = new ArrayList<>();
        while (readerFile.ready()) {
            int number = Integer.parseInt(readerFile.readLine());
            if (number % 2 == 0) {
                numbers.add(number);
            }
        }
        Collections.sort(numbers);
        numbers.forEach(System.out::println);

        readerFile.close();
        reader.close();
    }
}
