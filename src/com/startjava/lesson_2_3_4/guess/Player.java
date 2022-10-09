package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private final String name;
    private final int[] enteredNums;
    private int attemptsCounter;

    public Player(String name, int[] enteredNums) {
        this.name = name;
        this.enteredNums = enteredNums;
    }

    public String getName() {
        return name;
    }

    public int getAttemptsCounter() {
        return attemptsCounter;
    }

    public void setEnteredNum(int enteredNum) {
        enteredNums[attemptsCounter++] = enteredNum;
    }

    public void reset() {
        if (attemptsCounter > 0) Arrays.fill(enteredNums, 0, attemptsCounter - 1, 0);
        attemptsCounter = 0;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, attemptsCounter);
    }
}