package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    public static final int MAX_ATTEMPTS = 10;
    public static final int MAX_ROUNDS = 3;
    private final Player[] players;
    private final Scanner scanner;
    private Player currentPlayer;
    private int indexCurrentPlayer;

    public GuessNumber(String... names) {
        players = new Player[names.length];
        for (int i = 0; i < names.length; i++) {
            players[i] = new Player(names[i], MAX_ATTEMPTS);
        }
        scanner = new Scanner(System.in);
    }

    public void start() {
        initGame();
        System.out.println("Угадайте число от 1 до 100...");
        System.out.println("У каждого игрока по " + MAX_ATTEMPTS + " попыток в каждом раунде");
        for (int i = 1; i <= MAX_ROUNDS; i++) {
            initRound();
            startRound(i);
            showRoundResults(i);
        }
        showGameResults();
    }

    private void initGame() {
        shufflePlayers();
        for (Player player : players) player.setCountWins(0);
    }

    private void shufflePlayers() {
        int len = players.length;
        while (len > 0) {
            int index = (int) (Math.random() * len);
            Player tmp = players[--len];
            players[len] = players[index];
            players[index] = tmp;
        }
    }

    private void initRound() {
        for (Player player : players) player.resetAttempts();
        currentPlayer = players[indexCurrentPlayer = 0];
    }

    private void startRound(int round) {
        System.out.println("Раунд " + round);
        int secretNum = (int) (Math.random() * 100) + 1;
        while (true) {
            if (!hasAttempts()) break;
            System.out.print("Ход игрока " + currentPlayer.getName() + ": ");
            if (compareNums(guess(), secretNum, round)) break;
            changePlayer();
        }
    }

    private boolean hasAttempts() {
        if (currentPlayer.getCountAttempts() == MAX_ATTEMPTS) {
            System.out.println("У " + currentPlayer.getName() + " закончились попытки");
            return false;
        }
        return true;
    }

    private int guess() {
        while (true) {
            try {
                int playerNum = Integer.parseInt(scanner.nextLine());
                currentPlayer.addEnteredNum(playerNum);
                return playerNum;
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка ввода! Необходимо ввести целое число из диапазона от 1 до 100...");
            }
        }
    }

    private boolean compareNums(int playerNum, int secretNum, int round) {
        if (playerNum == secretNum) {
            currentPlayer.setCountWins(currentPlayer.getCountWins() + 1);
            System.out.println("В раунде " + round + " игрок " + currentPlayer.getName() + " угадал число " +
                    secretNum + " с " + currentPlayer.getCountAttempts() + " попытки");
            return true;
        }
        System.out.println("число " + playerNum + (playerNum > secretNum ? " больше " : " меньше ") +
                "того, что загадал компьютер");
        return false;
    }

    private void changePlayer() {
        indexCurrentPlayer++;
        if (indexCurrentPlayer == players.length) indexCurrentPlayer = 0;
        currentPlayer = players[indexCurrentPlayer];
    }

    private void showRoundResults(int round) {
        System.out.println("Результаты раунда " + round + ":");
        for (Player player : players) {
            System.out.print(" - игрок " + player.getName() + " ввел числа: ");
            for (int num : player.getEnteredNums()) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private void showGameResults() {
        System.out.println("В ходе игры игроки набрали следующее количество очков:");
        for (Player player : players) {
            System.out.println(" - " + player.getName() + ": " + player.getCountWins());
        }
        if (isTiedGame()) {
            System.out.println("Ничья!");
        } else {
            Player winner = findWinner();
            if (winner != null) System.out.println("Победил " + winner.getName());
        }
    }

    private boolean isTiedGame() {
        int score = players[0].getCountWins();
        for (int i = 1; i < players.length; i++) {
            if (score != players[i].getCountWins()) return false;
        }
        return true;
    }

    private Player findWinner() {
        Player winner = players[0];
        for (int i = 1; i < players.length; i++)  {
            if (winner.getCountWins() < players[i].getCountWins()) winner = players[i];
        }
        for (Player player : players) {
            if (winner != player && winner.getCountWins() == player.getCountWins()) return null;
        }
        return winner;
    }
}