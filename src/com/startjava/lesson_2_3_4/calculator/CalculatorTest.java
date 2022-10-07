package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Введите математическое выражение: ");
            String[] mathExpression = scanner.nextLine().split(" ");
            int num1 = Integer.parseInt(mathExpression[0]);
            char sign = mathExpression[1].charAt(0);
            int num2 = Integer.parseInt(mathExpression[2]);
            System.out.println("Результат: " + calculator.calculate(num1, num2, sign));
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        } while (answer.equals("yes"));
    }
}