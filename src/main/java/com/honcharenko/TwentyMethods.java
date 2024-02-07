package com.honcharenko;

import java.math.BigInteger;

public class TwentyMethods {
    /**
     * 1) Принимает массив чаров, выводит его на экран.
     */
    public static void printCharArray(char[] chars) {
        System.out.println(chars);
    }

    /**
     * 2) Принимает массив интов, возвращает массив чаров,
     * каждый символ в позиции массива соответствует коду символа передаваемого инта.
     */
    public static char[] getCharArrayFromIntArray(int[] ints) {
        char[] chars = new char[ints.length];
        for (int i = 0; i < ints.length; i++) {
            chars[i] = (char) ints[i];
        }
        return chars;
    }

    /**
     * 3) Принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
     */
    public static int getMaxInt(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }

    /**
     * 3.1) Принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
     */
    public static int getMaxIntWithTernary(int firstNumber, int secondNumber) {
        return (firstNumber >= secondNumber) ? firstNumber : secondNumber;
    }

    /**
     * 3.2) Принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
     */
    public static int getMaxIntWithBranching(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        }
        return secondNumber;
    }

    /**
     * 4) Принимает 3 инта, возвращает большее из них.
     */
    public static int getMaxInt(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        }
        if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        }
        return thirdNumber;
    }

    /**
     * 5) принимает 5 интов, возвращает большее из них.
     */
    public static int getMaxInt(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
        int[] ints = {firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber};
        int maxInt = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] >= maxInt) {
                maxInt = ints[i];
            }
        }
        return maxInt;
    }

    /**
     * 6) Принимает массив чаров, возвращает строку состоящую из символов массива.
     */
    public static String getStringFromCharArray(char[] chars) {
        String string = "";
        for (char item : chars) {
            string += item;
        }
        return string;
    }

    /**
     * 8) Принимает массив интов и значение типа инт.
     * Возвращает индекс массива, в котором значение совпадает с передаваемым начиная с начала массива.
     * Если значения в массиве нет - возвращает -1.
     */
    public static int findFirstIndexOfSearchingValueInArray(int[] ints, int searchValue) {
        int i = 0;
        for (int item : ints) {
            if (item == searchValue) {
                return i;
            }
            i++;
        }
        return -1;
    }


    /**
     * 9) Принимает массив интов и значение типа инт. Возвращает индекс массива, в котором значение совпадает с передаваемым начиная с конца массива. Если значения в массиве нет - возвращает -1.
     */
    public static int findLastIndexOfSearchingValueInArray(int[] ints, int searchValue) {
        int index = ints.length - 1;
        for (int i = index; i >= 0; i--) {
            if (ints[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 10) Метод принимает инт и возвращает факториал от заданого инта.
     */
    public static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = number; i > 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * 10.1) Метод принимает инт и возвращает факториал от заданого инта.
     */
    public static BigInteger calculateFactorialRecursive(int number) {
        if (number == 0) {
            return BigInteger.ONE;
        }
        BigInteger bigNumber = BigInteger.valueOf(number);
        return bigNumber.multiply(calculateFactorialRecursive(number - 1));
    }

    /**
     * 11) Принимает инт год и возвращает тру, если год высокосный.
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    /**
     * 12) Принимает массив интов и число, выводит на екран только елементы массива, которые кратны этому числу.
     */
    public static void filterIntArrayMultiples(int[] ints, int number) {
        for (int element : ints) {
            if (element % number == 0) {
                System.out.println(element);
            }
        }
    }

    /**
     * 13) Метод принимает массив интов, сортирует его по возрастанию.
     */
    public static void bubbleSortIntArrayInAscendingOrder(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 13.1) Метод принимает массив интов, сортирует его по возрастанию.
     */
    public static void selectionSortIntArrayInAscendingOrder(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            int indexOfMin = i;
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[j] < ints[indexOfMin]) {
                    indexOfMin = j;
                }
            }
            int temp = ints[indexOfMin];
            ints[indexOfMin] = ints[i];
            ints[i] = temp;
        }
    }

    /**
     * 14) Принимает массив байт. Если в массиве есть повторяющиеся елементы - возвращает тру.
     */
    public static boolean hasDuplicates(byte[] bytes) {
        for (int i = 0; i < bytes.length; i++) {
            for (int j = i + 1; j < bytes.length; j++) {
                if (bytes[i] == bytes[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 15) Принимает два массива интов одинаковых по длинне, возращает массив интов, который состоит из перемноженных елементов входящих массивов.
     */
    public static int[] multiplyArrays(int[] firstIntArray, int[] secondIntArray) {
        for (int i = 0; i < firstIntArray.length; i++) {
            firstIntArray[i] *= secondIntArray[i];
        }
        return firstIntArray;

    }
}
