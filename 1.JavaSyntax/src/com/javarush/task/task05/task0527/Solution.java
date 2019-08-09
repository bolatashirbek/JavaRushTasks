package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog dog = new Dog("Spike", 60, 7);
        Cat cat = new Cat("Tom", 5, 6);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int height;
        int age;

        public Dog(String name, int height, int age) {
            this.name = name;
            this.height = height;
            this.age = age;
        }
    }

    public static class Cat {
        String name;
        int age;
        int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }
}
