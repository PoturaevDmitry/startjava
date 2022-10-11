package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] enteredNums;
    private int countAttempts;
    private int countWins;

    public Player(String name, int maxAttempts) {
        this.name = name;
        this.enteredNums = new int[maxAttempts];
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, countAttempts);
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public int getCountWins() {
        return countWins;
    }

    public void setCountWins(int countWins) {
        this.countWins = countWins;
    }

    public void resetAttempts() {
        Arrays.fill(enteredNums, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public void addEnteredNum(int enteredNum) {
        if (enteredNum < 1 || enteredNum > 100) throw new IllegalArgumentException();
        enteredNums[countAttempts++] = enteredNum;
    }
}