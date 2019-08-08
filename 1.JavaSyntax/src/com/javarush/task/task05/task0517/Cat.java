package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    // Имя
    public Cat(String name) {
        this.name = name;
        this.age = 3;
        this.weight = 4;
        this.color = "black";
    }

    // Имя, вес, возраст
    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "white";
    }

    // Имя, возраст (вес стандартный)
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "gray";
    }

    // вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 2;
    }

    // вес, цвет, адрес (чужой домашний кот)
    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 4;
    }

    public static void main(String[] args) {

    }
}
