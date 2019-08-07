package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public static void main(String[] args) {

    }

    public void initialize(String name) {
        this.name = name;
        this.age = 2;
        this.weight = 3;
        this.color = "black";
    }

    //Имя, вес, возраст
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "brown";
    }

    //Имя, возраст (вес стандартный)
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "white";
    }

    //вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
    public void initialize(int weight, String color) {
        this.age = 2;
        this.weight = weight;
        this.color = color;
    }

    //вес, цвет, адрес (чужой домашний кот)
    public void initialize(int weight, String color, String address) {
        this.age = 3;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}
