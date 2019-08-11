package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double xPow = Math.pow((x2 - x1), 2);
        double yPow = Math.pow((y2 - y1), 2);
        double twoPointDistance = Math.sqrt(xPow + yPow);
        return twoPointDistance;
    }

    public static void main(String[] args) {
        System.out.println(getDistance(3, 4, 6, 5));
    }
}
