package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat murzik = new Cat("Мурзик", 2, 3, 5);
        Cat barsik = new Cat("Барсик", 3, 3, 6);
        Cat simka = new Cat("Симка", 4, 4, 7);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}