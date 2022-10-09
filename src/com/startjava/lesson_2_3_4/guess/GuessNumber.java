package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    public static final int MAX_ATTEMPTS = 10;
    private final Player player1;
    private final Player player2;

    public GuessNumber(String namePlayer1, String namePlayer2) {
        player1 = new Player(namePlayer1, new int[MAX_ATTEMPTS]);
        player2 = new Player(namePlayer2, new int[MAX_ATTEMPTS]);
    }

    public void start() {
        reset();
        int secretNum = (int) (Math.random() * 100) + 1;
        System.out.println("Угадайте число от 1 до 100...");
        System.out.println("У каждого игрока по " + MAX_ATTEMPTS + " попыток");
        while (true) {
            Player currentPlayer = selectPlayer();
            if (currentPlayer.getAttemptsCounter() == MAX_ATTEMPTS) {
                System.out.println("У " + currentPlayer.getName() + " закончились попытки");
                break;
            }
            System.out.print("Ход игрока " + currentPlayer.getName() + ": ");
            int playerNum = new Scanner(System.in).nextInt();
            currentPlayer.setEnteredNum(playerNum);
            if (playerNum == secretNum) {
                System.out.println("Игрок " + currentPlayer.getName() +  " угадал число " +
                        secretNum + " с " + currentPlayer.getAttemptsCounter() + " попытки");
                break;
            }
            System.out.println("число " + playerNum + (playerNum > secretNum ? " больше " : " меньше ") +
                    "того, что загадал компьютер");
        }
        showResults();
    }

    private void reset() {
        player1.reset();
        player2.reset();
    }

    private Player selectPlayer() {
        return player1.getAttemptsCounter() == player2.getAttemptsCounter() ? player1 : player2;
    }

    private void showResults() {
        System.out.println("Игрок " + player1.getName() +
                " ввел числа: " + intArrayToString(player1.getEnteredNums()));
        System.out.println("Игрок " + player2.getName() +
                " ввел числа: " + intArrayToString(player2.getEnteredNums()));
    }

    private String intArrayToString(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int num : array) {
            stringBuilder.append(num).append(" ");
        }
        return stringBuilder.toString();
    }
}