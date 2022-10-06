package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {5, 3, 1, 4, 7, 2, 6};
        printIntArray("Исходный массив:", intArr);
        int length = intArr.length;
        for (int i = 0; i < length; i++) {
            int tmp = intArr[i];
            intArr[i] = intArr[--length];
            intArr[length] = tmp;
        }
        printIntArray("Реверсивный массив:", intArr);

        System.out.println("\n2. Вывод произведения элементов массива");
        length = 10;
        intArr = new int[length];
        for (int i = 0; i < length; i++) {
            intArr[i] = i;
        }
        int result = 1;
        for (int i = 1; i < length - 1; i++) {
            result *= intArr[i];
            System.out.print(intArr[i] + (intArr[i] < 8 ? " * " : " = " + result));
        }
        System.out.println("\nЗначение: " + intArr[0] + ", индекс: 0; " +
                "значение: " + intArr[9] + ", индекс: 9");

        System.out.println("\n3. Удаление элементов массива");
        length = 15;
        double[] doubleArr = new double[length];
        for (int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
        }
        printDoubleArray("Исходный массив:", doubleArr);
        int cntZeroCells = 0;
        double middleNum = doubleArr[length / 2];
        for (int i = 0; i < length; i++) {
            if (doubleArr[i] > middleNum) {
                doubleArr[i] = 0;
                cntZeroCells++;
            }
        }
        printDoubleArray("Измененный массив:", doubleArr);
        System.out.println("Количество обнуленных ячеек: " + cntZeroCells);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        length = 'Z' - 'A' + 1;
        char[] uppercaseEnglishLetters = new char[length];
        for (int i = 0; i < length; i++) {
            uppercaseEnglishLetters[i] = (char) ('A' + i);
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(uppercaseEnglishLetters[length - 1 - j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        length = 30;
        intArr = new int[length];
        for (int i = 0; i < length; i++) {
            do {
                intArr[i] = 60 + (int) (Math.random() * 40);
            } while (!checkUniqueValueByIndex(intArr, i));
        }
        Arrays.sort(intArr);
        for (int i = 0; i < length; i++) {
            System.out.printf("%3d%s", intArr[i], (i + 1) % 10 == 0 ? "\n" : "");
        }

        System.out.println("\n6. Сдвиг элементов массива");
        String[] srcStringsArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        System.out.println("Исходный массив: " + Arrays.toString(srcStringsArr));
        length = 0;
        for (String string : srcStringsArr) {
            if (!string.isBlank()) length++;
        }
        String[] destStringsArr = new String[length];
        length = 0;
        int srcPos = 0;
        int destPos = 0;
        for (int i = 0; i < srcStringsArr.length; i++) {
            boolean stringIsBlank = srcStringsArr[i].isBlank();
            if (!stringIsBlank) {
                if (length == 0) srcPos = i;
                length++;
            }
            boolean lastString = i == srcStringsArr.length - 1;
            if (length != 0 && (stringIsBlank || lastString)) {
                System.arraycopy(srcStringsArr, srcPos, destStringsArr, destPos, length);
                destPos += length;
                length = 0;
            }
        }
        System.out.println("Измененный массив: " + Arrays.toString(destStringsArr));
    }

    private static void printIntArray(String caption, int[] array) {
        System.out.print(caption);
        for (int number : array) {
            System.out.print(" " + number);
        }
        System.out.println();
    }

    private static void printDoubleArray(String caption, double[] array) {
        System.out.println(caption);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%6.3f%s", array[i], i == array.length / 2 ? "\n" : "");
        }
        System.out.println();
    }

    private static boolean checkUniqueValueByIndex(int[] array, int index) {
        for (int i = 0; i < index; i++) {
            if (array[i] == array[index]) {
                return false;
            }
        }
        return true;
    }
}
