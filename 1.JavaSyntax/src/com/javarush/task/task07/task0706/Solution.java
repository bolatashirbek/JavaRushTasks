package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] houses = initializeArray();
        int evenHousesPeople = sumOfPeopleOfEvenHouses(houses);
        int oddHousesPeople = sumOfPeopleOfOddHouses(houses);

        if (evenHousesPeople < oddHousesPeople)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else
            System.out.println("В домах с четными номерами проживает больше жителей.");
    }

    /**
     * Считаем количество жителей проживающих на нечетной стороне улицы
     *
     * @param houses - принимаем созданный массив
     * @return - возвращаем сумму значений(нечетные)
     */
    private static int sumOfPeopleOfOddHouses(int[] houses) {
        int sum = 0;
        for (int i = 1; i < houses.length; i = i + 2) {
            sum += houses[i];
        }
        return sum;
    }

    /**
     * Считаем количество жителей проживающих на четной стороне улицы
     *
     * @param houses - принимаем созданный массив
     * @return - возвращаем сумму значений(четные)
     */
    private static int sumOfPeopleOfEvenHouses(int[] houses) {
        int sum = 0;
        for (int i = 0; i < houses.length; i = i + 2) {
            sum += houses[i];
        }
        return sum;
    }

    /**
     * инициализируем массив на 15 элементов(индекс элемента массива - номера дома)
     * введем в него значения с клавиатуры (значение массива - количество жителей)
     *
     * @return - возвращаем созданный массив
     * @throws IOException
     */
    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] houses = new int[15];
        for (int i = 0; i < houses.length; i++) {
            houses[i] = Integer.parseInt(reader.readLine());
        }
        return houses;
    }
}
