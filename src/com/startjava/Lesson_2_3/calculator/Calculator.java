package com.startjava.Lesson_2_3.calculator;

public class Calculator {

    public int calculate(int num1, int num2, char sign) {
        switch(sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '^':
                return pow(num1, num2);
            case '%':
                return num1 % num2;
            default:
                return 0;
        }
    }

    private int pow(int num1, int num2) {
        int result = 1;
        for (int i = 0; i < num2; i++) {
            result *= num1;
        }
        return result;
    }
}