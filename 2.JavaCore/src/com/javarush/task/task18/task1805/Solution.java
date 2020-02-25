package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.stream.Stream;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fileInputStream = new FileInputStream(reader.readLine())) {
            TreeSet<Integer> set = new TreeSet<>();
            while (fileInputStream.available() > 0) {
                set.add(fileInputStream.read());
            }
            Stream<Integer> stream = set.stream();
            stream.forEach(s -> System.out.print(s + " "));
        }
    }
}
