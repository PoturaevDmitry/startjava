package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    public static final int MAX_ATTEMPTS = 10;
    private final Player player1;
    private final Player player2;
    private final Scanner scanner;
    private Player currentPlayer;

    public GuessNumber(String namePlayer1, String namePlayer2) {
        player1 = new Player(namePlayer1, MAX_ATTEMPTS);
        player2 = new Player(namePlayer2, MAX_ATTEMPTS);
        scanner = new Scanner(System.in);
    }

    public void start() {
        init();
        int secretNum = (int) (Math.random() * 100) + 1;
        System.out.println("Угадайте число от 1 до 100...");
        System.out.println("У каждого игрока по " + MAX_ATTEMPTS + " попыток");
        currentPlayer = player1;
        while (true) {
            if (!hasAttempts()) break;
            System.out.print("Ход игрока " + currentPlayer.getName() + ": ");
            if (compareNums(guess(), secretNum)) break;
            changePlayer();
        }
        showPlayerAttempts(player1);
        showPlayerAttempts(player2);
    }

    private void init() {
        player1.reset();
        player2.reset();
    }

    private boolean hasAttempts() {
        if (currentPlayer.getCountAttempts() == MAX_ATTEMPTS) {
            System.out.println("У " + currentPlayer.getName() + " закончились попытки");
            return false;
        }
        return true;
    }

    private int guess() {
        int playerNum = scanner.nextInt();
        currentPlayer.addEnteredNum(playerNum);
        return playerNum;
    }

    private boolean compareNums(int playerNum, int secretNum) {
        if (playerNum == secretNum) {
            System.out.println("Игрок " + currentPlayer.getName() +  " угадал число " +
                    secretNum + " с " + currentPlayer.getCountAttempts() + " попытки");
            return true;
        }
        System.out.println("число " + playerNum + (playerNum > secretNum ? " больше " : " меньше ") +
                "того, что загадал компьютер");
        return false;
    }

    private void changePlayer() {
        currentPlayer = currentPlayer == player1 ? player2 : player1;
    }

    private void showPlayerAttempts(Player player) {
        System.out.print("Игрок " + player.getName() + " ввел числа: " );
        for (int num : player.getEnteredNums()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}