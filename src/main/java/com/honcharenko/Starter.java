package com.honcharenko;

import java.util.Arrays;

public class Starter {
    public static void main(String[] args) {
        System.out.println("\n1) Принимает массив чаров, выводит его на экран.");
        char[] chars = {'e', 'b', '@', '&', '^'};
        TwentyMethods.printCharArray(chars);
        chars = new char[]{};
        TwentyMethods.printCharArray(chars);

        System.out.println("\n\n2) Принимает массив интов, возвращает массив чаров, " +
                "каждый символ в позиции массива соответствует коду символа передаваемого инта.");
        int[] ints = {1000, 2000, 3000, 4000, 5000};
        System.out.println(TwentyMethods.getCharArrayFromIntArray(ints));
        ints = new int[]{};
        System.out.println(TwentyMethods.getCharArrayFromIntArray(ints));

        System.out.println("\n\n3) Принимает 2 инта, а и б, возвращает большее из этих 2х чисел.");
        System.out.println(TwentyMethods.getMaxInt(10, 15));

        System.out.println("\n\n3.1) Принимает 2 инта, а и б, возвращает большее из этих 2х чисел.");
        System.out.println(TwentyMethods.getMaxIntWithTernary(10, 15));

        System.out.println("\n\n3.2) Принимает 2 инта, а и б, возвращает большее из этих 2х чисел.");
        System.out.println(TwentyMethods.getMaxIntWithBranching(10, 15));

        System.out.println("\n\n4) Принимает 3 инта, возвращает большее из них.");
        System.out.println(TwentyMethods.getMaxInt(10, 35, 5));

        System.out.println("\n\n5) принимает 5 интов, возвращает большее из них.");
        System.out.println(TwentyMethods.getMaxInt(10, 35, 350, 23, 12));

        System.out.println("\n\n6) Принимает массив чаров, возвращает строку состоящую из символов массива.");
        System.out.println(TwentyMethods.getStringFromCharArray(new char[]{'&', '^', '$', '#', '@', '!', '|'}));
        System.out.println(TwentyMethods.getStringFromCharArray(new char[]{}));

        System.out.println("\n\n8) Принимает массив интов, и значение типа инт. " +
                "Возвращает индекс массива в котором значение совпадает с передаваемым, начиная с начала массива. " +
                "Если значения в массиве нет возвращает -1.");
        System.out.println(TwentyMethods.findFirstIndexOfSearchingValueInArray(new int[]{12, 34, 678, 3456, 8976, 12}, 3456));
        System.out.println(TwentyMethods.findFirstIndexOfSearchingValueInArray(new int[]{12, 34, 678, 3456, 8976, 12}, 3));
        System.out.println(TwentyMethods.findFirstIndexOfSearchingValueInArray(new int[]{}, 3));

        System.out.println("\n\n9) Принимает массив интов и значение типа инт. " +
                "Возвращает индекс массива, в котором значение совпадает с передаваемым начиная с конца массива. " +
                "Если значения в массиве нет - возвращает -1.");
        System.out.println(TwentyMethods.findLastIndexOfSearchingValueInArray(new int[]{12, 34, 678, 3456, 8976, 12}, 12));
        System.out.println(TwentyMethods.findLastIndexOfSearchingValueInArray(new int[]{12, 34, 678, 3456, 8976, 12}, 3));
        System.out.println(TwentyMethods.findLastIndexOfSearchingValueInArray(new int[]{}, 3));

        System.out.println("\n\n10) Метод принимает инт и возвращает факториал от заданого инта.");
        System.out.println(TwentyMethods.calculateFactorial(9));
        System.out.println(TwentyMethods.calculateFactorial(0));

        System.out.println("\n\n10.1) Метод принимает инт и возвращает факториал от заданого инта.");
        System.out.println(TwentyMethods.calculateFactorialRecursive(9));
        System.out.println(TwentyMethods.calculateFactorialRecursive(0));

        System.out.println("\n\n11) Принимает инт год и возвращает тру, если год высокосный.");
        System.out.println(TwentyMethods.isLeapYear(2024));
        System.out.println(TwentyMethods.isLeapYear(1700));

        System.out.println("\n\n12) Приминает массив интов и число, выводит на екран только елементы массива, " +
                "которые кратны этому числу.");
        TwentyMethods.filterIntArrayMultiples(new int[]{12, 34, 6781, 3456, 8976, 12}, 3);
        TwentyMethods.filterIntArrayMultiples(new int[]{}, 3);

        System.out.println("\n\n13) Метод принимает массив интов, сортирует его по возрастанию.");
        int[] arr_1 = new int[]{12, 34, 6781, 3456, 8976, 12};
        TwentyMethods.bubbleSortIntArrayInAscendingOrder(arr_1);
        for (int element : arr_1) {
            System.out.println(element);
        }

        System.out.println("\n\n13.1) Метод принимает массив интов, сортирует его по возрастанию.");
        int[] arr_2 = new int[]{12, 34, 6781, 3456, 8976, 12};
        TwentyMethods.selectionSortIntArrayInAscendingOrder(arr_2);
        for (int element : arr_2) {
            System.out.println(element);
        }

        System.out.println("\n\n14) Принимает массив байт. " +
                "Если в массиве есть повторяющиеся елементы - возвращает тру.");
        System.out.println(TwentyMethods.hasDuplicates(new byte[]{12, 34, 81, 56, 76, 1}));
        System.out.println(TwentyMethods.hasDuplicates(new byte[]{12, 34, 81, 6, 6, 1}));
        System.out.println(TwentyMethods.hasDuplicates(new byte[]{}));

        System.out.println("\n\n15) Принимает два массива интов одинаковых по длинне, " +
                "возращает массив интов, который состоит из перемноженных елементов входящих массивов.");
        int[] firstIntArray = new int[]{12, 34, 81, 6, 7, 1};
        int[] secondIntArray = new int[]{1, 7, 5, 1, 34, 12};
        int[] resultIntArray = TwentyMethods.multiplyArrays(firstIntArray, secondIntArray);
        for (int item : resultIntArray) {
            System.out.println(item);
        }

        System.out.println("\n\n16) Принимает два массива интов, " +
                "возвращает массив из елементов, которые не совпадают в массивах.");
        int[] firstArray = new int[]{73, 3, 1, 6, 7, 45};
        int[] secondArray = new int[]{45, 77, 3, 21, 1};
        int[] resultArray = TwentyMethods.findNonMatchingElements(firstArray, secondArray);
        System.out.println(Arrays.toString(resultArray));

        System.out.println("\n\n17) Принимает масив интов, возвращает его же, но в реверсном порядке.");
        int[] intArray = new int[]{12, 34, 81, 6, 7, 1};
        int[] reversedIntArray = TwentyMethods.reverseIntArray(intArray);
        for (int item : reversedIntArray) {
            System.out.println(item);
        }

        System.out.println("\n\n18) Принимает 3 инта: размер выходного массива, нижняя граница, верхняя граница. " +
                "Возвращает массив интов заданой длинный, " +
                "который содержит случайные числа от нижней границы до верхней границы.");
        int arraySize = 10;
        int lowerBound=-5;
        int upperBound=0;

        int[] randomArray = TwentyMethods.generateRandomArray(arraySize, lowerBound, upperBound);
        System.out.println(Arrays.toString(randomArray));

        System.out.println("\n\n19) Принимает 2 массива чаров, " +
                "проверяет есть ли в 1 массиве такая же последовательность символов, " +
                "которую представляет собой второй массив. " +
                "Возвращает булеан.");
        char[] array1 = {'a', 'b', 'c', 'd', 'e'};
        char[] array2 = {'c', 'd'};
        boolean result = TwentyMethods.isCharSubArray(array1, array2);
        System.out.println(result);
    }
}
