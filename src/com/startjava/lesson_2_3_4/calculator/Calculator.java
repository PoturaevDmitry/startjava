package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static int num1;
    private static int num2;
    private static char operation;

    public static int calculate(String expression) {
        parseExpression(expression);
        return switch (operation) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> {
                if (num2 == 0) throw new IllegalArgumentException("деление на ноль невозможно");
                yield Math.floorDiv(num1, num2);
            }
            case '^' -> (int) Math.pow(num1, num2);
            case '%' -> {
                if (num2 == 0) throw new IllegalArgumentException("деление на ноль невозможно");
                yield num1 % num2;
            }
            default -> throw new IllegalArgumentException("введена неподдерживаемая операция");
        };
    }

    private static void parseExpression(String expression) {
        String[] mathExpression = expression.split(" ");
        if (mathExpression.length != 3) throw new IllegalArgumentException("выражение имеет неверный формат");
        num1 = extractIntNumber(mathExpression[0]);
        num2 = extractIntNumber(mathExpression[2]);
        operation = extractMathOperation(mathExpression[1]);
    }

    private static int extractIntNumber(String string) {
        if (!isNumeric(string)) throw new IllegalArgumentException("введенно значение, не являющееся числом");
        try {
            int number = Integer.parseInt(string);
            if (number < 0) throw new IllegalArgumentException("введено отрицательное число");
            return number;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("введено не целое число");
        }
    }

    private static char extractMathOperation(String string) {
        if (string.length() != 1) throw new IllegalArgumentException("неверный формат математической операции");
        return string.charAt(0);
    }

    private static boolean isNumeric(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}