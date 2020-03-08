package com.javarush.task.task21.task2113;

import java.util.*;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());
        Horse akbozat = new Horse("Ақбозат", 3, 0);
        Horse kulager = new Horse("Құлагер", 3, 0);
        Horse naizagai = new Horse("Найзағай", 3, 0);
        game.getHorses().add(akbozat);
        game.getHorses().add(kulager);
        game.getHorses().add(naizagai);
    }

    public Hippodrome(List<Horse> list) {
        this.horses = list;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() {
    }

    public void move() {
    }

    public void print() {
    }
}
