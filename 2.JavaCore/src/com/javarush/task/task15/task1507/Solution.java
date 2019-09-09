package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
        printMatrix(3, 3, 8);
        printMatrix(3, 3, 9.9);
        printMatrix(3, 3, true);
        printMatrix(4, (short) 1600);
        printMatrix((byte) 18);
        printMatrix(4, 9999);
        printMatrix((float) 4.4);
        printMatrix('$');
    }

    public static void printMatrix(char value) {
        System.out.println("Заполняем объектами char");
        printMatrix(3, 4, value);
    }

    public static void printMatrix(float value) {
        System.out.println("Заполняем объектами float");
        printMatrix(3, 2, value);
    }

    public static void printMatrix(int m, int value) {
        System.out.println("Заполняем объектами int");
        printMatrix(m, 2, (Object) value);
    }

    public static void printMatrix(byte value) {
        System.out.println("Заполняем объектами byte");
        printMatrix(2, 2, value);
    }

    public static void printMatrix(int m, short value) {
        System.out.println("Заполняем объектами short");
        printMatrix(m, 3, value);
    }

    public static void printMatrix(int m, int n, Boolean value) {
        System.out.println("Заполняем объектами Boolean");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Double value) {
        System.out.println("Заполняем объектами Double");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Integer value) {
        System.out.println("Заполняем объектами Integer");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
