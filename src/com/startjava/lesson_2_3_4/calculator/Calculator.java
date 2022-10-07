package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static int num1;
    private static int num2;
    private static char operation;

    public static int calculate(String[] expression) {
        parsExpression(expression);
        return switch (operation) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '^' -> (int) Math.pow(num1, num2);
            case '%' -> num1 % num2;
            default -> throw new IllegalArgumentException();
        };
    }

    private static void parsExpression(String[] expression) {
        if (expression.length != 3) throw new IllegalArgumentException();
        num1 = getNumber(expression[0]);
        num2 = getNumber(expression[2]);
        operation = getOperation(expression[1]);
    }

    private static int getNumber(String string) {
        int number = Integer.parseInt(string);
        if (number < 0) throw new IllegalArgumentException();
        return number;
    }

    private static char getOperation(String string) {
        if (string.length() != 1) return ' ';
        return string.charAt(0);
    }
}