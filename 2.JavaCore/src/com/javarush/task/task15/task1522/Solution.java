package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String text = reader.readLine();
            if (Planet.EARTH.equals(text)) {
                thePlanet = Earth.getInstance();
            } else if (Planet.MOON.equals(text)) {
                thePlanet = Moon.getInstance();
            } else if (Planet.SUN.equals(text)) {
                thePlanet = Sun.getInstance();
            } else {
                thePlanet = null;
            }
            System.out.println(thePlanet);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
