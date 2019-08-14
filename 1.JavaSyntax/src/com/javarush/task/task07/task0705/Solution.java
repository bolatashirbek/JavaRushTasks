package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] largeArray = initializeBigArray();
        int[] secondSmalArray = copyArrayToTwoSmall(largeArray);
        printSmallArray(secondSmalArray);
    }

    /**
     * создаем большой массив на 20 целых чисел и заполняем его с клавиатуры
     *
     * @return - возвращаем созданный массив
     * @throws IOException
     */
    public static int[] initializeBigArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] largeArray = new int[20];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = Integer.parseInt(reader.readLine());
        }
        return largeArray;
    }

    /**
     * создаем два маленьких массива на 10 чисел каждый,
     * скопируем одну половину большого массива в первый маленький, а вторую половину - во второй маленький массив
     *
     * @param largeArray - большой массив
     * @return - возвращаем второй маленький массив
     */
    public static int[] copyArrayToTwoSmall(int[] largeArray) {
        int[] firstSmallArray = new int[10];
        int[] secondSmallArray = new int[10];
        for (int i = 0; i < largeArray.length; i++) {
            if (i < 10)
                firstSmallArray[i] = largeArray[i];
            else
                secondSmallArray[i - 10] = largeArray[i];
        }
        return secondSmallArray;
    }

    // выводим второй маленький массив на экран, каждое значение с новой строки
    private static void printSmallArray(int[] secondSmalArray) {
        for (int i = 0; i < secondSmalArray.length; i++) {
            System.out.println(secondSmalArray[i]);
        }
    }
}
