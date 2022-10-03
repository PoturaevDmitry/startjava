package com.startjava.Lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte screenSize = 15;
        short coresCpu = 8;
        int bitsCpu = 64;
        long discSize = 512L;
        float freqCpu = 1.8f;
        double ramSize = 16.0;
        char osType = 'W';
        boolean desktop = false;
        System.out.println("Информация о компьютере:");
        System.out.println("\t- операционная система (W/U -Windows/UNIX) - " + osType);
        System.out.println("\t - тип компьютера (true/false - настольный/ноутбук) - " + desktop);
        System.out.println("\t - размер экрана - " + screenSize);
        System.out.println("\t - разрядность процессора - " + bitsCpu);
        System.out.println("\t - количество ядер процессора - " + coresCpu);
        System.out.println("\t - частота процессора - " + freqCpu);
        System.out.println("\t - размер ОЗУ - " + ramSize + "ГБ");
        System.out.println("\t - размер диска - " + discSize + "ГБ");

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int costPen = 100;
        int costBook = 200;
        int percentDiscount = 11;
        double discount = (costPen + costBook) * percentDiscount / 100;
        System.out.println("Сумма скидки: " + discount);
        System.out.println("Общая стоимость с учетом скидки: " + (costPen + costBook - discount));
        
        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a\n" +
                "   J   a a  v   v  a a\n" +
                "J  J  aaaaa  V V  aaaaa\n" +
                " JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("Первоначальные значения целочисленных переменных:\n" +
                "\tbyte: " + maxByte + "; short: " + maxShort + "; int: "
                + maxInt + "; long: " + maxLong);
        System.out.println("Значения целочисленных переменных после инкремента:\n" +
                "\tbyte: " + ++maxByte + "; short: " + ++maxShort + "; int: " +
                ++maxInt + "; long: " + ++maxLong);
        System.out.println("Значения целочисленных переменных после декремента:\n" +
                "\tbyte: " + --maxByte + "; short: " + --maxShort + "; int: " +
                --maxInt + "; long: " + --maxLong);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("\nПерестановка с помощью третьей переменной");
        System.out.println("Исходные значения переменных: num1=" + num1 + ", num2=" + num2);
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println("Значения переменных после перестановки: num1=" + num1 + ", num2=" + num2);
        System.out.println("\nПерестановка с помощью арифметических операций");
        System.out.println("Исходные значения переменных: num1=" + num1 + ", num2=" + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Значения переменных после перестановки: num1=" + num1 + ", num2=" + num2);
        System.out.println("\nПерестановка с помощью побитовой операции ^");
        System.out.println("Исходные значения переменных: num1=" + num1 + ", num2=" + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Значения переменных после перестановки: num1=" + num1 + ", num2=" + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char ch1 = 35;
        char ch2 = 38;
        char ch3 = 64;
        char ch4 = 94;
        char ch5 = 95;
        System.out.println((int) ch1 + "   " + ch1 + "\n" +
                (int) ch2 + "   " + ch2 + "\n" +
                (int) ch3 + "   " + ch3 + "\n" +
                (int) ch4 + "   " + ch4 + "\n" +
                (int) ch5 + "   " + ch5);
        
        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        int srcNum = 123;
        System.out.println("Число " + srcNum + " содержит:");
        System.out.println((srcNum / 100 % 10) + " сотен");
        System.out.println((srcNum / 10 % 10) + " десятков");
        System.out.println((srcNum % 10) + " единиц");
        
        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char leftBracket = '(';
        char rightBracket = ')';
        char lowLine = '_';
        char space = ' ';
        System.out.println("" + space + space + space + space + slash + backslash);
        System.out.println("" + space + space + space + slash + space + space + backslash);
        System.out.println("" + space + space + slash + lowLine + leftBracket + space +
                rightBracket + backslash);
        System.out.println("" + space + slash + space + space + space + space + space +
                space + backslash);
        System.out.println("" + slash + lowLine + lowLine + lowLine + lowLine +
                slash + backslash + lowLine + lowLine + backslash);

        System.out.println("\n9. Произведение и сумма цифр числа");
        srcNum = 345;
        int digit1 = srcNum % 10;
        int digit2 = srcNum / 10 % 10;
        int digit3 = srcNum / 100 % 10;
        System.out.println("сумма цифр числа " + srcNum + " = " +
                (digit1 + digit2 + digit3));
        System.out.println("произведение цифр числа " + srcNum + " = " +
                (digit1 * digit2 * digit3));

        System.out.println("\n10. Преобразование секунд");
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}