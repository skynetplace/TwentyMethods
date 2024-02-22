package com.honcharenko;

import java.util.Arrays;

public class Starter {
    public static void main(String[] args) {
        System.out.println("\n1) Принимает массив чаров, выводит его на экран.");
        test_1_case_1();
        test_1_case_2();
        System.out.println("\n\n2) Принимает массив интов, возвращает массив чаров, " +
                "каждый символ в позиции массива соответствует коду символа передаваемого инта.");
        test_2_case_1();
        test_2_case_2();
        System.out.println("\n\n3.1) Принимает 2 инта, а и б, возвращает большее из этих 2х чисел.");
        test_3_1_case_1();
        test_3_1_case_2();
        System.out.println("\n\n3.2) Принимает 2 инта, а и б, возвращает большее из этих 2х чисел.");
        test_3_2_case_1();
        test_3_2_case_2();
        System.out.println("\n\n3.3) Принимает 2 инта, а и б, возвращает большее из этих 2х чисел.");
        test_3_3_case_1();
        test_3_3_case_2();
        System.out.println("\n\n4) Принимает 3 инта, возвращает большее из них.");
        test_4_case_1();
        test_4_case_2();
        System.out.println("\n\n5) принимает 5 интов, возвращает большее из них.");
        test_5_case_1();
        test_5_case_2();
        System.out.println("\n\n6) Принимает массив чаров, возвращает строку состоящую из символов массива.");
        test_6_case_1();
        test_6_case_2();
        System.out.println("\n\n8) Принимает массив интов, и значение типа инт. " +
                "Возвращает индекс массива в котором значение совпадает с передаваемым, начиная с начала массива. " +
                "Если значения в массиве нет возвращает -1.");
        test_8_case_1();
        test_8_case_2();
        test_8_case_3();
        System.out.println("\n\n9) Принимает массив интов и значение типа инт. " +
                "Возвращает индекс массива, в котором значение совпадает с передаваемым начиная с конца массива. " +
                "Если значения в массиве нет - возвращает -1.");
        test_9_case_1();
        test_9_case_2();
        test_9_case_3();
        System.out.println("\n\n10.1) Метод принимает инт и возвращает факториал от заданого инта.");
        test_10_1_case_1();
        test_10_1_case_2();
        System.out.println("\n\n10.2) Метод принимает инт и возвращает факториал от заданого инта.");
        test_10_2_case_1();
        test_10_2_case_2();
        System.out.println("\n\n11) Принимает инт год и возвращает тру, если год высокосный.");
        test_11_case_1();
        test_11_case_2();
        System.out.println("\n\n12) Приминает массив интов и число, выводит на екран только елементы массива, " +
                "которые кратны этому числу.");
        test_12_case_1();
        test_12_case_2();
        System.out.println("\n\n13.1) Метод принимает массив интов, сортирует его по возрастанию.");
        test_13_1_case_1();
        test_13_1_case_2();
        System.out.println("\n\n13.2) Метод принимает массив интов, сортирует его по возрастанию.");
        test_13_2_case_1();
        test_13_2_case_2();
        System.out.println("\n\n14) Принимает массив байт. " +
                "Если в массиве есть повторяющиеся елементы - возвращает тру.");
        test_14_case_1();
        test_14_case_2();
        test_14_case_3();
        System.out.println("\n\n15) Принимает два массива интов одинаковых по длинне, " +
                "возращает массив интов, который состоит из перемноженных елементов входящих массивов.");
        test_15_case_1();
        test_15_case_2();
        System.out.println("\n\n16) Принимает два массива интов, " +
                "возвращает массив из елементов, которые не совпадают в массивах.");
        test_16_case_1();
        test_16_case_2();
        test_16_case_3();
        test_16_case_4();
        System.out.println("\n\n17) Принимает масив интов, возвращает его же, но в реверсном порядке.");
        test_17_case_1();
        test_17_case_2();
        System.out.println("\n\n18) Принимает 3 инта: размер выходного массива, нижняя граница, верхняя граница. " +
                "Возвращает массив интов заданой длинный, " +
                "который содержит случайные числа от нижней границы до верхней границы.");
        test_18_case_1();
        test_18_case_2();
        test_18_case_3();
        test_18_case_4();
        test_18_case_5();
        System.out.println("\n\n19) Принимает 2 массива чаров, " +
                "проверяет есть ли в 1 массиве такая же последовательность символов, " +
                "которую представляет собой второй массив. " +
                "Возвращает булеан.");
        test_19_case_1();
        test_19_case_2();
        test_19_case_3();
        test_19_case_4();
        test_19_case_5();
    }

    private static void test_1_case_1() {
        char[] chars = {'e', 'b', '@', '&', '^'};
        TwentyMethods.printCharArray(chars);
    }

    private static void test_1_case_2() {
        char[] chars = {};
        TwentyMethods.printCharArray(chars);
    }

    private static void test_2_case_1() {
        int[] ints = {1000, 2000, 3000, 4000, 5000};
        System.out.println(TwentyMethods.getCharArrayFromIntArray(ints));
    }

    private static void test_2_case_2() {
        int[] ints = {};
        System.out.println(TwentyMethods.getCharArrayFromIntArray(ints));
    }

    private static void test_3_1_case_1() {
        System.out.println(TwentyMethods.getMaxInt(10, 15));
    }

    private static void test_3_1_case_2() {
        System.out.println(TwentyMethods.getMaxInt(7, 7));
    }

    private static void test_3_2_case_1() {
        System.out.println(TwentyMethods.getMaxIntWithTernary(10, 15));
    }

    private static void test_3_2_case_2() {
        System.out.println(TwentyMethods.getMaxIntWithTernary(7, 7));
    }

    private static void test_3_3_case_1() {
        System.out.println(TwentyMethods.getMaxIntWithBranching(10, 15));
    }

    private static void test_3_3_case_2() {
        System.out.println(TwentyMethods.getMaxIntWithBranching(7, 7));
    }

    private static void test_4_case_1() {
        System.out.println(TwentyMethods.getMaxInt(10, 35, 5));
    }

    private static void test_4_case_2() {
        System.out.println(TwentyMethods.getMaxInt(8, 8, 8));
    }

    private static void test_5_case_1() {
        System.out.println(TwentyMethods.getMaxInt(10, 35, 350, 23, 12));
    }

    private static void test_5_case_2() {
        System.out.println(TwentyMethods.getMaxInt(23, 23, 23, 23, 23));
    }

    private static void test_6_case_1() {
        char[] chars = {'&', '^', '$', '#', '@', '!', '|'};
        System.out.println(TwentyMethods.getStringFromCharArray(chars));
    }

    private static void test_6_case_2() {
        char[] chars = {};
        System.out.println(TwentyMethods.getStringFromCharArray(chars));
    }

    private static void test_8_case_1() {
        int[] ints = {12, 34, 678, 3456, 8976, 12};
        System.out.println(TwentyMethods.findFirstIndexOfSearchingValueInArray(ints, 3456));
    }

    private static void test_8_case_2() {
        int[] ints = {12, 34, 678, 3456, 8976, 12};
        System.out.println(TwentyMethods.findFirstIndexOfSearchingValueInArray(ints, 3));
    }

    private static void test_8_case_3() {
        int[] ints = {};
        System.out.println(TwentyMethods.findFirstIndexOfSearchingValueInArray(ints, 3));
    }

    private static void test_9_case_1() {
        int[] ints = {12, 34, 678, 3456, 8976, 12};
        System.out.println(TwentyMethods.findLastIndexOfSearchingValueInArray(ints, 12));
    }

    private static void test_9_case_2() {
        int[] ints = {12, 34, 678, 3456, 8976, 12};
        System.out.println(TwentyMethods.findLastIndexOfSearchingValueInArray(ints, 3));
    }

    private static void test_9_case_3() {
        int[] ints = {};
        System.out.println(TwentyMethods.findLastIndexOfSearchingValueInArray(ints, 3));
    }

    private static void test_10_1_case_1() {
        System.out.println(TwentyMethods.calculateFactorial(9));
    }

    private static void test_10_1_case_2() {
        System.out.println(TwentyMethods.calculateFactorial(0));
    }

    private static void test_10_2_case_1() {
        System.out.println(TwentyMethods.calculateFactorialRecursive(9));
    }

    private static void test_10_2_case_2() {
        System.out.println(TwentyMethods.calculateFactorialRecursive(0));
    }

    private static void test_11_case_1() {
        System.out.println(TwentyMethods.isLeapYear(2024));
    }

    private static void test_11_case_2() {
        System.out.println(TwentyMethods.isLeapYear(1700));
    }

    private static void test_12_case_1() {
        int[] ints = {12, 34, 6781, 3456, 8976, 12};
        TwentyMethods.filterIntArrayMultiples(ints, 3);
    }

    private static void test_12_case_2() {
        int[] ints = {};
        TwentyMethods.filterIntArrayMultiples(ints, 3);
    }

    private static void test_13_1_case_1() {
        int[] ints = {12, 34, 6781, 3456, 8976, 12};
        TwentyMethods.bubbleSortIntArrayInAscendingOrder(ints);
        System.out.println(Arrays.toString(ints));
    }

    private static void test_13_1_case_2() {
        int[] ints = {};
        TwentyMethods.bubbleSortIntArrayInAscendingOrder(ints);
        System.out.println(Arrays.toString(ints));
    }

    private static void test_13_2_case_1() {
        int[] ints = {12, 34, 6781, 3456, 8976, 12};
        TwentyMethods.selectionSortIntArrayInAscendingOrder(ints);
        System.out.println(Arrays.toString(ints));
    }

    private static void test_13_2_case_2() {
        int[] ints = {};
        TwentyMethods.selectionSortIntArrayInAscendingOrder(ints);
        System.out.println(Arrays.toString(ints));
    }

    private static void test_14_case_1() {
        byte[] bytes = {12, 34, 81, 56, 76, 1};
        System.out.println(TwentyMethods.hasDuplicates(bytes));
    }

    private static void test_14_case_2() {
        byte[] bytes = {12, 34, 81, 6, 6, 1};
        System.out.println(TwentyMethods.hasDuplicates(bytes));
    }

    private static void test_14_case_3() {
        byte[] bytes = {};
        System.out.println(TwentyMethods.hasDuplicates(bytes));
    }

    private static void test_15_case_1() {
        int[] firstIntArray = {12, 34, 81, 6, 7, 1};
        int[] secondIntArray = {1, 7, 5, 1, 34, 12};
        int[] resultIntArray = TwentyMethods.multiplyArrays(firstIntArray, secondIntArray);
        System.out.println(Arrays.toString(resultIntArray));
    }

    private static void test_15_case_2() {
        int[] firstIntArray = {};
        int[] secondIntArray = {};
        int[] resultIntArray = TwentyMethods.multiplyArrays(firstIntArray, secondIntArray);
        System.out.println(Arrays.toString(resultIntArray));
    }

    private static void test_16_case_1() {
        int[] firstArray = {72, 73, 3, 6, 7, 45, 99};
        int[] secondArray = {72, 77, 3, 21, 7};
        int[] resultArray = TwentyMethods.findNonMatchingElements(firstArray, secondArray);
        System.out.println(Arrays.toString(resultArray));
    }

    private static void test_16_case_2() {
        int[] firstArray = {73, 3, 1, 6, 7, 45};
        int[] secondArray = {};
        int[] resultArray = TwentyMethods.findNonMatchingElements(firstArray, secondArray);
        System.out.println(Arrays.toString(resultArray));
    }

    private static void test_16_case_3() {
        int[] firstArray = {};
        int[] secondArray = {45, 77, 3, 21, 1};
        int[] resultArray = TwentyMethods.findNonMatchingElements(firstArray, secondArray);
        System.out.println(Arrays.toString(resultArray));
    }

    private static void test_16_case_4() {
        int[] firstArray = {};
        int[] secondArray = {};
        int[] resultArray = TwentyMethods.findNonMatchingElements(firstArray, secondArray);
        System.out.println(Arrays.toString(resultArray));
    }

    private static void test_17_case_1() {
        int[] ints = {12, 34, 81, 6, 7, 1};
        System.out.println(Arrays.toString(TwentyMethods.reverseIntArray(ints)));
    }

    private static void test_17_case_2() {
        int[] ints = {};
        System.out.println(Arrays.toString(TwentyMethods.reverseIntArray(ints)));
    }

    private static void test_18_case_1() {
        System.out.println(Arrays.toString(TwentyMethods.generateRandomArray(0, 5, 10)));
    }

    private static void test_18_case_2() {
        System.out.println(Arrays.toString(TwentyMethods.generateRandomArray(-3, 5, 10)));
    }

    private static void test_18_case_3() {
        System.out.println(Arrays.toString(TwentyMethods.generateRandomArray(10, 5, 5)));
    }

    private static void test_18_case_4() {
        System.out.println(Arrays.toString(TwentyMethods.generateRandomArray(10, 5, 10)));
    }

    private static void test_18_case_5() {
        System.out.println(Arrays.toString(TwentyMethods.generateRandomArray(10, 10, 5)));
    }

    private static void test_19_case_1() {
        char[] firstArray = {'a', 'b', 'c', 'd', 'e'};
        char[] secondArray = {'c', 'd'};
        System.out.println(TwentyMethods.isCharSubArray(firstArray, secondArray));
    }

    private static void test_19_case_2() {
        char[] firstArray = {'c', 'd'};
        char[] secondArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(TwentyMethods.isCharSubArray(firstArray, secondArray));
    }

    private static void test_19_case_3() {
        char[] firstArray = {};
        char[] secondArray = {'c', 'd'};
        System.out.println(TwentyMethods.isCharSubArray(firstArray, secondArray));
    }

    private static void test_19_case_4() {
        char[] firstArray = {'a', 'b', 'c', 'd', 'e'};
        char[] secondArray = {};
        System.out.println(TwentyMethods.isCharSubArray(firstArray, secondArray));
    }

    private static void test_19_case_5() {
        char[] firstArray = {};
        char[] secondArray = {};
        System.out.println(TwentyMethods.isCharSubArray(firstArray, secondArray));
    }
}