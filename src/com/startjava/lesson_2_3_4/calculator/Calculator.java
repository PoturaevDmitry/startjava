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
        String[] partsExpression = expression.split(" ");
        if (partsExpression.length != 3) throw new IllegalArgumentException("выражение имеет неверный формат");
        num1 = parsePositiveInt(partsExpression[0]);
        num2 = parsePositiveInt(partsExpression[2]);
        operation = parseMathOperation(partsExpression[1]);
    }

    private static int parsePositiveInt(String string) {
        double number;
        try {
            number = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("введенно значение, не являющееся числом");
        }
        if (number < 0) throw new IllegalArgumentException("введено отрицательное число");
        if (number > Integer.MAX_VALUE)
            throw new IllegalArgumentException("введено слишком большие число");
        if (number - (int) number != 0) throw new IllegalArgumentException("введено не целое число");
        return (int) number;
    }

    private static char parseMathOperation(String string) {
        if (string.length() != 1) throw new IllegalArgumentException("неверный формат математической операции");
        return string.charAt(0);
    }
}