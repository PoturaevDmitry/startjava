package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        do {
            System.out.println("Введите первое число: ");
            int num1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Введите знак математической операции: ");
            char sign = scanner.nextLine().charAt(0);
            System.out.println("Введите второе число: ");
            int num2 = scanner.nextInt();
            scanner.nextLine();
            int result = calculator.calculate(num1, num2, sign);
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.nextLine();
            } while(!answer.equals("no") && !answer.equals("yes"));
        } while(!answer.equals("no"));
    }
}