public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEvenNum = 0;
        int sumOddNum = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEvenNum += counter;
            } else {
                sumOddNum += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + 
                sumEvenNum + ", а нечетных = " + sumOddNum);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int sum = 0;
        while (srcNum != 0) {
            int digit = srcNum % 10;
            sum += digit;
            System.out.print(digit);
            srcNum /= 10;
        }
        System.out.println("\n" + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int startRange = 1;
        int endRange = 24;
        int columns = 5;
        counter = 0;
        for (int i = startRange; i < endRange; i += 2) {
            if (counter == columns) {
                System.out.println();
                counter = 0;
            }
            counter++;
            System.out.printf("%2d ", i);
        }
        for (int i = 0; i < columns - counter; i++) {
            System.out.printf("%2d ", 0);
        }
        System.out.println();

        System.out.println("\n5. Проверка количества единиц на четность");
        srcNum = 3141591;
        System.out.print("число " + srcNum);
        int countOnes = 0;
        while (srcNum != 0) {
            if (srcNum % 10 == 1) {
                countOnes++;
            }
            srcNum /= 10;
        }
        if (countOnes > 0) {
            System.out.println(" содержит " + countOnes + 
                    ((countOnes % 2 == 0) ? " (четное) " : " (нечетное) ") + "количество единиц");
        } else {
            System.out.println(" не содержит единиц");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");
        columns = 10;
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int row = 0;
        while (row < rows) {
            int col = row;
            while (col < rows) {
                System.out.print("#");
                col++;
            }
            System.out.println();
            row++;
        }
        System.out.println();

        row = 0;
        do {
            if (row < rows / 2) {
                columns = row + 1;
            } else {
                columns = rows - row;
            }
            int col = 0;
            do {
                System.out.print("$");
                col++;
            } while (col < columns);
            System.out.println();
            row++;
        } while (row < rows);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%5s%5s%n", "Dec", "Char");
        for (char ch = '\u0001'; ch < '0'; ch++) {
            if (ch % 2 != 0) {
                System.out.printf("%5d%5c%n", (int) ch, ch);
            }
        }
        System.out.println();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch % 2 == 0) {
                System.out.printf("%5d%5c%n", (int) ch, ch);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        srcNum = 1234321;
        int copySrcNum = srcNum;
        int reverseNum = 0;
        while (srcNum != 0) {
            reverseNum = reverseNum * 10 + srcNum % 10;
            srcNum /= 10;
        }
        if (copySrcNum == reverseNum) {
            System.out.println("число " + copySrcNum +  " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        srcNum = 456961;
        copySrcNum = srcNum;
        counter = 0;
        int maxNumDigits = 6;
        int sum1 = 0;
        int sum2 = 0;
        while (srcNum != 0) {
            if (counter % (maxNumDigits / 2) == 0) {
                System.out.print("Сумма цифр ");
            }
            int digit = srcNum % 10;
            System.out.print(digit);
            if (counter < maxNumDigits / 2) {
                sum1 += digit;
            } else {
                sum2 += digit;
            }
            counter++;
            if (counter == maxNumDigits / 2) {
                System.out.println(" = " + sum1);
            }
            if (counter == maxNumDigits) {
                System.out.println(" = " + sum2);
            }
            srcNum /= 10;
        }
        System.out.print("Число " + copySrcNum);
        if (counter == maxNumDigits && sum1 == sum2) {
            System.out.println(" является счастливым");
        } else {
            System.out.println(" не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.printf("%3s", " ");
            } else if (i == 1) {
                System.out.printf("%s", "|");
            } else {
                System.out.printf("%3d", i);
            }
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i != 1) {
                System.out.printf("%s", "---");
            } else {
                System.out.printf("%s", "|");
            }
        }
        System.out.println();

        for (int i = 2; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    System.out.printf("%2d", i);
                } else if (j == 1) {
                    System.out.printf("%2s", "|");
                } else {
                    System.out.printf("%3d", i * j);
                }
            }
            System.out.println();
        }
    }
}