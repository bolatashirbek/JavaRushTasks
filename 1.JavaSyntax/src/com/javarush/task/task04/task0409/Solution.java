package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int aCloserToTen = 10 - a;
        int bCloserToTen = 10 - b;

        // Проверяем кто ближе к десяти, в нашем случае это наименьший
        if (abs(aCloserToTen) >= abs(bCloserToTen)) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}