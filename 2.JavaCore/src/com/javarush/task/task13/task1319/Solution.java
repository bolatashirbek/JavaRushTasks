package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

        while (true) {
            String text = reader.readLine();
            bw.write(text);
            bw.newLine();
            if (text.equals("exit")) break;
        }

        bw.close();
        reader.close();
    }
}
