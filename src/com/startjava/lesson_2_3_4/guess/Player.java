package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] enteredNums;
    private int countAttempts;

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

    public void reset() {
        Arrays.fill(enteredNums, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public void addEnteredNum(int enteredNum) {
        enteredNums[countAttempts++] = enteredNum;
    }
}