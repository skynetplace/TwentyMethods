package com.honcharenko;

public class TwentyMethods {
    // 1) Принимает массив чаров, выводит его на экран.
    public static void printCharArray(char[] arr) {
        System.out.println(arr);
    }

    // 2) Принимает массив интов, возвращает массив чаров,
// каждый символ в позиции массива соответствует коду символа передаваемого инта.
    public static char[] getCharArrayFromIntArray(int[] arrInt) {
        char[] arrChar = new char[arrInt.length];
        for (int i = 0; i < arrInt.length; i++) {
            arrChar[i] = (char) arrInt[i];
        }
        return arrChar;
    }

    // 3) Принимает 2 инта, а и б, возвращает большее из этих 2х чисел.
    public static int getMaxInt(int a, int b) {
        return Math.max(a, b);
    }

    // 4) Принимает 3 инта, возвращает большее из них.
    public static int getMaxInt(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    // 5) принимает 5 интов, возвращает большее из них.
    public static int getMaxInt(int a, int b, int c, int d, int e) {
        int[] arrInt = {a, b, c, d, e};
        int max = arrInt[0];
        for (int i = 1; i < arrInt.length; i++) {
            if (arrInt[i] >= max) {
                max = arrInt[i];
            }
        }
        return max;
    }

    // 6) Принимает массив чаров, возвращает строку состоящую из символов массива.
    public static String getStringFromCharArray(char[] arrChar) {
        StringBuilder string = new StringBuilder();
        for (char item : arrChar) {
            string.append(item);
        }
        return string.toString();
    }

    // 8) Принимает массив интов и значение типа инт.
// Возвращает индекс массива, в котором значение совпадает с передаваемым начиная с начала массива.
// Если значения в массиве нет - возвращает -1.
    public static int findFirstIndexOfValueInArray(int[] arrInt, int findValue) {
        int i = 0;
        for (int item : arrInt) {
            if (item == findValue) {
                return i;
            }
            i++;
        }
        return -1;
    }


    // 9) Принимает массив интов и значение типа инт. Возвращает индекс массива, в котором значение совпадает с передаваемым начиная с конца массива. Если значения в массиве нет - возвращает -1.
    public static int findLastIndexOfValueInArray(int[] arrInt, int findValue) {
        int i = arrInt.length - 1;
        for (int item : arrInt) {
            if (item == findValue) {
                return i;
            }
            i--;
        }
        return -1;
    }

    // 10) Метод принимает инт и возвращает факториал от заданого инта.
    public static int calculateFactorial(int a) {
        int factorial = 1;
        for (int i = a; i > 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    // 11) Принимает инт год и возвращает тру, если год высокосный.
    public static boolean checkLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return true;
        } else return year % 4 == 0;
    }


    // 12) Приминает массив интов и число, выводит на екран только елементы массива, которые кратны этому числу.
    public static void filterArrayMultiples(int[] arr, int a) {
        for (int item : arr) {
            if (item % a == 0) {
                System.out.println(item);
            }
        }
    }

    // 13) Метод принимает массив интов, сортирует его по возрастанию.
    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int more = arr[i];
                int less = arr[i + 1];
                arr[i] = less;
                arr[i + 1] = more;
            }
        }

    }

    // 14) Принимает массив байт. Если в массиве есть повторяющиеся елементы - возвращает тру.
    public static boolean checkRepeatValue(byte[] arr) {
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            for (int t = i + 1; t < arr.length; t++) {
                if (arr[i] == arr[t]) {
                    check = true;
                    break;
                }
            }
        }
        return check;
    }

    // 15) Принимает два массива интов одинаковых по длинне, возращает массив интов, который состоит из перемноженных елементов входящих массивов.
    public static int[] multiplyArrays(int[] arr_1, int[] arr_2) {
        int[] arr_3 = new int[arr_1.length];
        for (int i = 0; i < arr_1.length; i++) {
            arr_3[i] = arr_1[i] * arr_2[i];
        }
        return arr_3;

    }

// 16) Принимает два массива интов, возвращает массив из елементов, которые не совпадают в массивах.
// 17) Принимает масив интов, возвращает его же, но в реверсном порядке.
// 18) Принимает 3 инта: размер выходного массива, нижняя граница, верхняя граница. Возвращает массив интов заданой длинный, который содержит случайные числа от нижней границы до верхней границы.
// 19) Принимает 2 массива чаров, проверяет есть ли в 1 массиве такая же последовательность символов, которую представляет собой второй массив. Возвращает булеан.
}
