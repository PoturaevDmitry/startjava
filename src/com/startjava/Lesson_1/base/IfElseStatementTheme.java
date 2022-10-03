package com.startjava.Lesson_1.base;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 35;
        if (age > 20) {
            System.out.println("Ты взрослый человек");
        } else {
            System.out.println("Танцуй, пока молодой");
        }
        boolean maleGender = true;
        if (!maleGender) {
            System.out.println("Женщиной тоже быть не плохо");
        } else {
            System.out.println("Поздравляю, ты мужчина!");
        }
        double growth = 1.85;
        if (growth < 1.80) {
            System.out.println("Не высокий, не значит маленький");
        } else {
            System.out.println("Отлично, ты богатырь!");
        }
        char firstLetterName = "Ivan".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Твое имя начинается на букву 'M'");
        } else if (firstLetterName == 'I') {
            System.out.println("Твое имя начинается на букву 'I'");
        } else {
            System.out.println("Имя твое - человек");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 23;
        int num2 = 68;
        if (num1 > num2) {
            System.out.println("Максимальным является число " +
                    num1 + ", минимальным - число " + num2);
        } else if (num1 < num2) {
            System.out.println("Максимальным является число " +
                    num2 + ", минимальным - число " + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Работа с числом");
        int num = 12;
        if (num == 0) {
            System.out.println("Анализируемое число равно нулю");
        } else {
            System.out.println("Число " + num + " является:");
            if (num > 0) {
                System.out.println(" - положительным;");
            } else {
                System.out.println(" - отрицательным;");
            }
            if (num % 2 == 0) {
                System.out.println(" - четным.");
            } else {
                System.out.println(" - нечетным.");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        num1 = 864;
        num2 = 761;
        System.out.println("Проанализируем два числа: " + num1 + " и " + num2);
        boolean isMatches = false;
        int digit = num1 % 10;
        if (digit == num2 % 10) {
            System.out.println(" - в первом разряде чисел одинаковые цифры - " + digit);
            isMatches = true;
        }
        digit = num1 / 10 % 10;
        if (digit == num2 / 10 % 10) {
            System.out.println(" - во втором разряде чисел одинаковые цифры - " + digit);
            isMatches = true;
        }
        digit = num1 / 100 % 10;
        if (digit == num2 / 100 % 10) {
            System.out.println(" - в третьем разряде чисел одинаковые цифры - " + digit);
            isMatches = true;
        }
        if (!isMatches) {
            System.out.println(" - в числах нет одинаковых цифр");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char ch = '\u0057';
        System.out.print("Введенный символ " + "'" + ch + "' - ");
        if (ch >= '0' && ch <= '9') {
            System.out.println("число");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("большая буква");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("маленькая буква");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        double amount = 300_000.0;
        double interest;
        if (amount < 100_000) {
            interest = amount * 0.05;
        } else if (amount >= 100_000 && amount <= 300_000) {
            interest = amount * 0.07;
        } else {
            interest = amount * 0.10;
        }
        System.out.println("Сумма вклада: " + amount);
        System.out.println("Начисленный процент: " + interest);
        System.out.println("Итоговая сумма с процентом: " + (amount + interest));

        System.out.println("\n7. Определение оценки по предметам");
        int pctHistory = 59;
        int markHistory;
        if (pctHistory > 91) {
            markHistory = 5;
        } else if (pctHistory > 73) {
            markHistory = 4;
        } else if (pctHistory > 60) {
            markHistory = 3;
        } else {
            markHistory = 2;
        }
        System.out.println(markHistory + " - история");
        int pctProgramming = 91;
        int markProgramming;
        if (pctProgramming > 91) {
            markProgramming = 5;
        } else if (pctProgramming > 73) {
            markProgramming = 4;
        } else if (pctProgramming > 60) {
            markProgramming = 3;
        } else {
            markProgramming = 2;
        }
        System.out.println(markProgramming + " - программирование");
        System.out.println("Средний балл оценок по предметам: " + 
                ((markHistory + markProgramming) / 2));
        System.out.println("Средний % по предметам: " +
                ((pctHistory + pctProgramming) / 2));

        System.out.println("\n8. Расчет прибыли");
        int rentalPrice = 5000;
        int revenue = 13000;
        int costPrice = 9000;
        int annualProfit = 12 * (revenue - costPrice - rentalPrice);
        System.out.print("прибыль за год: ");
        if (annualProfit > 0) {
            System.out.print("+");
        }
        System.out.println(annualProfit);

        System.out.println("\n9. Подсчет количества банкнот");
        int sum = 567;
        int maxBanknote10 = 5;
        int cntBanknote100 = sum / 100;
        int cntBanknote10 = (sum - 100 * cntBanknote100) / 10;
        if (cntBanknote10 > maxBanknote10) {
            cntBanknote10 = maxBanknote10;
        }
        int cntBanknote1 = sum - (100 * cntBanknote100 + 10 * cntBanknote10);
        System.out.println("Количество банкнот номиналом 1$: " + cntBanknote1);
        System.out.println("Количество банкнот номиналом 10$: " + cntBanknote10);
        System.out.println("Количество банкнот номиналом 100$: " + cntBanknote100);
        System.out.println("Исходная сумма: " +
                (cntBanknote100 * 100 + cntBanknote10 * 10 + cntBanknote1));
    }
}