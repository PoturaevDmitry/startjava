package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Введите математическое выражение: ");
            do {
                try {
                    System.out.println("Результат: " + Calculator.calculate(scanner.nextLine()));
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Введенное выражение содержит некорректные данные... " + e.getMessage());
                }
                System.out.print("Введите корректное математическое выражение: ");
            } while (true);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        } while (answer.equals("yes"));
    }
}