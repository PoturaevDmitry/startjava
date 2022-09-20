public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEvenNum = 0;
        int sumOddNum = 0;
        int num = -10;
        do {
            if (num % 2 == 0) {
                sumEvenNum += num;
            } else {
                sumOddNum += num;
            }
            num++;
        } while (num <= 21);
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
        min = 1;
        max = 24;
        int columns = 5;
        int cnt = 0;
        for (int i = min; i < max; i += 2) {
            if (cnt == columns) {
                System.out.println();
                cnt = 0;
            }
            cnt++;
            System.out.printf("%2d ", i);
        }
        for (int i = 0; i < columns - cnt; i++) {
            System.out.printf("%2d ", 0);
        }
        System.out.println();

        System.out.println("\n5. Проверка количества единиц на четность");
        srcNum = 3141591;
        System.out.print("число " + srcNum);
        cnt = 0;
        while (srcNum != 0) {
            if (srcNum % 10 == 1) {
                cnt++;
            }
            srcNum /= 10;
        }
        if (cnt > 0) {
            System.out.println(" содержит " + cnt + 
                    ((cnt % 2 == 0) ? " (четное) " : " (нечетное) ") + "количество единиц");
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
        int tmp = srcNum / 10;
        int dstNum = srcNum % 10;
        while (tmp != 0) {
            dstNum = dstNum * 10 + tmp % 10;
            tmp /= 10;
        }
        if (srcNum == dstNum) {
            System.out.println("число " + srcNum +  " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        srcNum = 456961;
        tmp = srcNum;
        int sum1 = 0;
        System.out.print("Сумма цифр ");
        while (tmp > 1000) {
            int digit = tmp % 10;
            System.out.print(digit);
            sum1 += digit; 
            tmp /= 10;
        }
        System.out.println(" = " + sum1);
        int sum2 = 0;
        System.out.print("Сумма цифр ");
        while (tmp != 0) {
            int digit = tmp % 10;
            System.out.print(digit);
            sum2 += digit; 
            tmp /= 10;
        }
        System.out.println(" = " + sum2);
        System.out.print("Число " + srcNum);
        if (sum1 == sum2) {
            System.out.println(" является счастливым");
        } else {
            System.out.println(" не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0) {
                    if (j > 1) {
                        System.out.printf("%3d", j);
                    }
                } else if (i == 1) {
                    if (j != 1) {
                        System.out.printf("%s", "---");
                    }
                } else if (j == 0) {
                    System.out.printf("%2d", i);
                } else if (j > 1) {
                    System.out.printf("%3d", i * j);
                }
                if (j == 1) {
                    if (i == 0) {
                        System.out.printf("%4s", "|");
                    } else if (i == 1) {
                        System.out.printf("%s", "|");
                    } else {
                        System.out.printf("%2s", "|");
                    }
                }
            }
            System.out.println();
        }
    }
}