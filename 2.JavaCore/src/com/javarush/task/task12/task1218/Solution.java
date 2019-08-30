package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove {
        @Override
        public void eat() {
            System.out.println("Собака есть пищу.");
        }

        @Override
        public void move() {
            System.out.println("Собака бегает.");
        }
    }

    public class Duck implements CanMove, CanFly, CanEat {
        @Override
        public void eat() {
            System.out.println("Утка есть пищу.");
        }

        @Override
        public void fly() {
            System.out.println("Утка летит.");
        }

        @Override
        public void move() {
            System.out.println("Утка передвигается по земле.");
        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {
            System.out.println("Машина набрала скорость.");
        }
    }

    public class Airplane implements CanMove, CanFly {
        @Override
        public void fly() {
            System.out.println("Самалет летит.");
        }

        @Override
        public void move() {
            System.out.println("Самалет начал движение.");
        }
    }
}
