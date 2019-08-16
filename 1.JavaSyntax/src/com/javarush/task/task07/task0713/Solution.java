package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbersDivide3 = new ArrayList<>();
        ArrayList<Integer> numbersDivide2 = new ArrayList<>();
        ArrayList<Integer> otherNubers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
        }

        for (int i = 0; i < numbers.size(); i++) {
            int x = numbers.get(i);
            if (x % 3 == 0) {
                numbersDivide3.add(x);
            }
            if (x % 2 == 0) {
                numbersDivide2.add(x);
            } else if (x % 3 != 0) {
                otherNubers.add(x);
            }
        }

        printList(numbersDivide3);
        printList(numbersDivide2);
        printList(otherNubers);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}
