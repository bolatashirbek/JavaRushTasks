package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        List<String> list = Arrays.asList(months);
        String monthName = reader.readLine();
        if (list.indexOf(monthName) != -1) {
            System.out.println(monthName + " is the " + (list.indexOf(monthName) + 1) + " month");
        }
    }
}
