package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("Игра \"Угадай число\"");
        System.out.println("""
                Правила игры:\s
                 - в игре участвуют два игрока
                 - компьютер загадывает число от 1 до 100
                 - игроки по очереди пытаются угадать число
                 - выигрывает игрок, первым угадавший число
                """);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();

        GuessNumber game = new GuessNumber(name1, name2);

        String answer;
        do {
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        } while (answer.equals("yes"));
        System.out.println("Конец игры");
    }
}