package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(reader.readLine());
            nums.add(number);
        }
        Collections.sort(nums);

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
