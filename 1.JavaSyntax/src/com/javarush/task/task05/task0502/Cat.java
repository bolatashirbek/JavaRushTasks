package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int cat1Score = 0;
        int cat2Score = 0;

        if (this.age > anotherCat.age)
            cat1Score++;
        else if (this.age == anotherCat.age) {
            cat1Score++;
            cat2Score++;
        } else cat2Score++;

        if (this.weight > anotherCat.weight)
            cat1Score++;
        else if (this.weight == anotherCat.weight) {
            cat1Score++;
            cat2Score++;
        } else cat2Score++;

        if (this.strength > anotherCat.strength)
            cat1Score++;
        else if (this.strength == anotherCat.strength) {
            cat1Score++;
            cat2Score++;
        } else cat2Score++;

        if (cat1Score > cat2Score) return true;
        return false;
    }

    public static void main(String[] args) {

    }
}
