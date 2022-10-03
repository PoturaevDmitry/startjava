package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int secretNum = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        Player currentPlayer = player1;
        int playerNum;
        System.out.println("Угадайте число от 1 до 100...");
        do {
            System.out.print("Ход игрока " + currentPlayer.getName() + ": ");
            playerNum = scanner.nextInt();
            if (playerNum == secretNum) {
                System.out.println("Победил игрок " + currentPlayer.getName());
                break;
            }
            if (playerNum > secretNum) {
                System.out.println("число " + playerNum + " больше того, что загадал компьютер");
            } else if (playerNum < secretNum) {
                System.out.println("число " + playerNum + " меньше того, что загадал компьютер");
            }
            currentPlayer = currentPlayer == player1 ? player2 : player1;
        } while (true);
    }
}