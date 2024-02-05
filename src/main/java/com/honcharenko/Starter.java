package com.honcharenko;

public class Starter {
    public static void main(String[] args) {
        System.out.println("\n1) Принимает массив чаров, выводит его на экран.");
        char[] arrChar = {'e', 'b', '@', '&', '^'};
        TwentyMethods.printCharArray(arrChar);

        System.out.println("\n\n2) Принимает массив интов, возвращает массив чаров, каждый символ в позиции массива соответствует коду символа передаваемого инта.");
        int[] arrInt = {1000, 2000, 3000, 4000, 5000};
        System.out.println(TwentyMethods.getCharArrayFromIntArray(arrInt));

        System.out.println("\n\n3) Принимает 2 инта, а и б, возвращает большее из этих 2х чисел.");
        System.out.println(TwentyMethods.getMaxInt(10, 15));

        System.out.println("\n\n4) Принимает 3 инта, возвращает большее из них.");
        System.out.println(TwentyMethods.getMaxInt(10, 35, 5));

        System.out.println("\n\n5) принимает 5 интов, возвращает большее из них.");
        System.out.println(TwentyMethods.getMaxInt(10, 35, 350, 23, 12));

        System.out.println("\n\n6) Принимает массив чаров, возвращает строку состоящую из символов массива.");
        System.out.println(TwentyMethods.getStringFromCharArray(new char[]{'&', '^', '$', '#', '@', '!', '|'}));

        System.out.println("\n\n8) Принимает массив интов, и значение типа инт. Возвращает индекс массива в котором значение совпадает с передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1.");
        System.out.println(TwentyMethods.findFirstIndexOfValueInArray(new int[]{12, 34, 678, 3456, 8976, 12}, 3456));
        System.out.println(TwentyMethods.findFirstIndexOfValueInArray(new int[]{12, 34, 678, 3456, 8976, 12}, 3));

        System.out.println("\n\n9) Принимает массив интов и значение типа инт. Возвращает индекс массива, в котором значение совпадает с передаваемым начиная с конца массива. Если значения в массиве нет - возвращает -1.");
        System.out.println(TwentyMethods.findLastIndexOfValueInArray(new int[]{12, 34, 678, 3456, 8976, 12}, 12));
        System.out.println(TwentyMethods.findLastIndexOfValueInArray(new int[]{12, 34, 678, 3456, 8976, 12}, 3));

        System.out.println("\n\n10) Метод принимает инт и возвращает факториал от заданого инта.");
        System.out.println(TwentyMethods.calculateFactorial(9));
        System.out.println(TwentyMethods.calculateFactorial(0));

        System.out.println("\n\n11) Принимает инт год и возвращает тру, если год высокосный.");
        System.out.println(TwentyMethods.checkLeapYear(2024));

        System.out.println("\n\n12) Приминает массив интов и число, выводит на екран только елементы массива, которые кратны этому числу.");
        TwentyMethods.filterArrayMultiples(new int[]{12, 34, 6781, 3456, 8976, 12}, 3);

        System.out.println("\n\n13) Метод принимает массив интов, сортирует его по возрастанию.");
        int[] arr = new int[]{12, 34, 6781, 3456, 8976, 12};
        TwentyMethods.sortArray(arr);
        for (int item : arr) {
            System.out.println(item);
        }

        System.out.println("\n\n14) Принимает массив байт. Если в массиве есть повторяющиеся елементы - возвращает тру.");
        System.out.println(TwentyMethods.checkRepeatValue(new byte[]{12, 34, 81, 56, 76, 1}));
        System.out.println(TwentyMethods.checkRepeatValue(new byte[]{12, 34, 81, 6, 6, 1}));

        System.out.println("\n\n15) Принимает два массива интов одинаковых по длинне, возращает массив интов, который состоит из перемноженных елементов входящих массивов.");
        int[] arr_1 = new int[]{12, 34, 81, 6, 7, 1};
        int[] arr_2 = new int[]{1, 7, 5, 1, 34, 12};
        int[] arr_3 = TwentyMethods.multiplyArrays(arr_1, arr_2);
        for (int item : arr_3) {
            System.out.println(item);
        }
    }
}
