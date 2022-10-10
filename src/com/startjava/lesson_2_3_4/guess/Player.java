package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

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

    public int getCountAttempts() {
        return countAttempts;
    }

    public void reset() {
        if (countAttempts > 0) Arrays.fill(enteredNums, 0, countAttempts - 1, 0);
        countAttempts = 0;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, countAttempts);
    }

    public int guess() {
        Scanner scanner = new Scanner(System.in);
        int playerNum = scanner.nextInt();
        setEnteredNum(playerNum);
        return playerNum;
    }

    private void setEnteredNum(int enteredNum) {
        enteredNums[countAttempts++] = enteredNum;
    }
}