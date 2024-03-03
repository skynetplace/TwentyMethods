package com.honcharenko;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.math.BigInteger;

import static com.honcharenko.TwentyMethods.*;
import static org.junit.jupiter.api.Assertions.*;

class TwentyMethodsTest {


    @Test
    void givenCharArray_whenPrintCharArray_thenPrintToConsole() {
        // given
        char[] chars = {'e', 'b', '@', '&', '^'};
        String expectedOutput = "eb@&^";
        OutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        // when
        printCharArray(chars);
        // then
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void givenEmptyCharArray_whenPrintCharArray_thenPrintToConsole() {
        char[] chars = {};
        String expectedOutput = "";
        OutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        printCharArray(chars);
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    void givenIntArray_whenGetCharArrayFromIntArray_thenReturnCharArray() {
        int[] ints = {1000, 2000, 3000, 4000, 5000};
        char[] expected = {'Ϩ', 'ߐ', 'ஸ', 'ྠ', 'ᎈ'};
        char[] actual = getCharArrayFromIntArray(ints);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void givenEmptyIntArray_whenGetCharArrayFromIntArray_thenReturnEmptyCharArray() {
        int[] ints = {};
        char[] expected = {};
        char[] actual = getCharArrayFromIntArray(ints);
        assertArrayEquals(expected, actual);
    }

    @Test
    void givenTwoIntsAndTheFirstIsGreater_whenGetMaxInt_thenReturnFirst() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expected = 10;
        int actual = getMaxInt(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }

    @Test
    void givenTwoIntsAndTheSecondIsGreater_whenGetMaxInt_thenReturnSecond() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expected = 10;
        int actual = getMaxInt(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }

    @Test
    void givenTwoEqualInts_whenGetMaxInt_thenReturnOneOfThem() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expected = 10;
        int actual = getMaxInt(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }

    @Test
    void getMaxIntWithTernary_whenFirstNumberIsGreater() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expected = 10;
        int actual = getMaxIntWithTernary(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }

    @Test
    void getMaxIntWithTernary_whenSecondNumberIsGreater() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expected = 10;
        int actual = getMaxIntWithTernary(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }

    @Test
    void getMaxIntWithTernary_whenNumbersAreEqual() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expected = 10;
        int actual = getMaxIntWithTernary(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }

    @Test
    void getMaxIntWithBranching_whenFirstNumberIsGreater() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expected = 10;
        int actual = getMaxIntWithBranching(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }

    @Test
    void getMaxIntWithBranching_whenSecondNumberIsGreater() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expected = 10;
        int actual = getMaxIntWithBranching(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }

    @Test
    void getMaxIntWithBranching_whenNumbersAreEqual() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expected = 10;
        int actual = getMaxIntWithBranching(firstNumber, secondNumber);
        assertEquals(expected, actual);
    }

    @Test
    void givenThreeIntsAndTheFirstIsGreater_whenGetMaxInt_thenReturnFirst() {
        int firstNumber = 15;
        int secondNumber = 10;
        int thirdNumber = 5;
        int expected = 15;
        int actual = getMaxInt(firstNumber, secondNumber, thirdNumber);
        assertEquals(expected, actual);
    }

    @Test
    void givenThreeIntsAndTheSecondIsGreater_whenGetMaxInt_thenReturnSecond() {
        int firstNumber = 10;
        int secondNumber = 15;
        int thirdNumber = 5;
        int expected = 15;
        int actual = getMaxInt(firstNumber, secondNumber, thirdNumber);
        assertEquals(expected, actual);
    }

    @Test
    void givenThreeIntsAndTheThirdIsGreater_whenGetMaxInt_thenReturnThird() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 15;
        int expected = 15;
        int actual = getMaxInt(firstNumber, secondNumber, thirdNumber);
        assertEquals(expected, actual);
    }

    @Test
    void getMaxInt_whenThreeNumbersInputAndNumbersAreEqual() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expected = 10;
        int actual = getMaxInt(firstNumber, secondNumber, thirdNumber);
        assertEquals(expected, actual);
    }

    @Test
    void getMaxInt_whenFiveNumbersInputAndFirstNumberIsGreater() {
        int firstNumber = 25;
        int secondNumber = 10;
        int thirdNumber = 15;
        int fourthNumber = 20;
        int fifthNumber = 5;
        int expected = 25;
        int actual = getMaxInt(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
        assertEquals(expected, actual);
    }

    @Test
    void getMaxInt_whenFiveNumbersInputAndSecondNumberIsGreater() {
        int firstNumber = 10;
        int secondNumber = 25;
        int thirdNumber = 15;
        int fourthNumber = 20;
        int fifthNumber = 5;
        int expected = 25;
        int actual = getMaxInt(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
        assertEquals(expected, actual);
    }

    @Test
    void getMaxInt_whenFiveNumbersInputAndThirdNumberIsGreater() {
        int firstNumber = 15;
        int secondNumber = 10;
        int thirdNumber = 25;
        int fourthNumber = 20;
        int fifthNumber = 5;
        int expected = 25;
        int actual = getMaxInt(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
        assertEquals(expected, actual);
    }

    @Test
    void getMaxInt_whenFiveNumbersInputAndFourthNumberIsGreater() {
        int firstNumber = 20;
        int secondNumber = 10;
        int thirdNumber = 15;
        int fourthNumber = 25;
        int fifthNumber = 5;
        int expected = 25;
        int actual = getMaxInt(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
        assertEquals(expected, actual);
    }

    @Test
    void getMaxInt_whenFiveNumbersInputAndFifthNumberIsGreater() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 15;
        int fourthNumber = 20;
        int fifthNumber = 25;
        int expected = 25;
        int actual = getMaxInt(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
        assertEquals(expected, actual);
    }

    @Test
    void getMaxInt_whenFiveNumbersInputAndNumbersAreEqual() {
        int firstNumber = 25;
        int secondNumber = 25;
        int thirdNumber = 25;
        int fourthNumber = 25;
        int fifthNumber = 25;
        int expected = 25;
        int actual = getMaxInt(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
        assertEquals(expected, actual);
    }

    @Test
    void getStringFromCharArray_whenSingleCharacter() {
        char[] chars = {'$'};
        String expected = "$";
        String actual = getStringFromCharArray(chars);
        assertEquals(expected, actual);
    }

    @Test
    void getStringFromCharArray_whenMultipleCharacters() {
        char[] chars = {'&', '^', '$', '#', '@', '!', '|'};
        String expected = "&^$#@!|";
        String actual = getStringFromCharArray(chars);
        assertEquals(expected, actual);
    }

    @Test
    void givenEmptyCharArray_whenGetStringFromCharArray_thenReturnExpectedString() {
        char[] chars = {};
        String expected = "";
        String actual = getStringFromCharArray(chars);
        assertEquals(expected, actual);
    }

    @Test
    void findFirstIndexOfSearchValueInArray_whenValueExists() {
        int[] ints = {12, 34, 678, 3456, 8976, 12};
        int searchValue = 678;
        int actual = findFirstIndexOfSearchValueInArray(ints, searchValue);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void givenIntArrayAndNotExistingInArrayValue_whenFindFirstIndexOfSearchValueInArray_thenReturnMinusOne() {
        int[] ints = {12, 34, 678, 3456, 8976, 12};
        int searchValue = 1;
        int actual = findFirstIndexOfSearchValueInArray(ints, searchValue);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void findFirstIndexOfSearchValueInArray_whenEmptyArray() {
        int[] ints = {};
        int searchValue = 1;
        int actual = findFirstIndexOfSearchValueInArray(ints, searchValue);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void findLastIndexOfSearchValueInArray_whenValueExists() {
        int[] ints = {12, 34, 678, 3456, 8976, 12};
        int searchValue = 12;
        int actual = findLastIndexOfSearchValueInArray(ints, searchValue);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void findLastIndexOfSearchValueInArray_whenValueNotExists() {
        int[] ints = {12, 34, 678, 3456, 8976, 12};
        int searchValue = 1;
        int actual = findLastIndexOfSearchValueInArray(ints, searchValue);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void findLastIndexOfSearchValueInArrayWithDublicates_whenValueExists() {
        int[] ints = {12, 34, 678, 3456, 1, 8976, 12};
        int searchValue = 12;
        int actual = findLastIndexOfSearchValueInArray(ints, searchValue);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void findLastIndexOfSearchValueInArrayWithoutDublicates_whenValueExists() {
        int[] ints = {12, 34, 678, 3456, 1, 8976};
        int searchValue = 1;
        int actual = findLastIndexOfSearchValueInArray(ints, searchValue);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void findLastIndexOfSearchValueInArray_whenEmptyArray() {
        int[] ints = {};
        int searchValue = 1;
        int actual = findLastIndexOfSearchValueInArray(ints, searchValue);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void calculateFactorial_whenPositiveNumber() {
        int number = 9;
        int expected = 362880;
        int actual = calculateFactorial(number);
        assertEquals(expected, actual);
    }

    @Test
    void calculateFactorial_whenNumberIsZero() {
        int number = 0;
        int expected = 1;
        int actual = calculateFactorial(number);
        assertEquals(expected, actual);
    }

    @Test
    void calculateFactorialRecursive_whenPositiveNumber() {
        int number = 5;
        BigInteger expected = BigInteger.valueOf(120);
        BigInteger actual = calculateFactorialRecursive(number);
        assertEquals(expected, actual);
    }

    @Test
    void calculateFactorialRecursive_whenNumberIsZero() {
        int number = 0;
        BigInteger expected = BigInteger.ONE;
        BigInteger actual = calculateFactorialRecursive(number);
        assertEquals(expected, actual);
    }

    @Test
    void calculateFactorialRecursive_whenLargeNumberInActual() {
        int number = 100;
        BigInteger expected = new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000");
        BigInteger actual = calculateFactorialRecursive(number);
        assertEquals(expected, actual);
    }

    @Test
    void isLeapYear_whenYearIsLeap() {
        int year = 2024;
        boolean actual = isLeapYear(year);
        assertTrue(actual);
    }

    @Test
    void isLeapYear_whenYearIsNotLeap() {
        int year = 2023;
        boolean actual = isLeapYear(year);
        assertFalse(actual);
    }

    @Test
    void isLeapYear_whenYearDivisibleBy100AndNotDivisibleBy400() {
        int year = 1700;
        boolean actual = isLeapYear(year);
        assertFalse(actual);
    }

    @Test
    public void filterIntArrayMultiples_whenArrayNotEmpty() {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = 2;
        String expectedOutput = "2" + System.lineSeparator()
                + "4" + System.lineSeparator()
                + "6" + System.lineSeparator()
                + "8" + System.lineSeparator()
                + "10" + System.lineSeparator();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        filterIntArrayMultiples(ints, number);
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void filterIntArrayMultiples_whenArrayEmpty() {
        int[] ints = {};
        int number = 2;
        String expectedOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        filterIntArrayMultiples(ints, number);
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void bubbleSortIntArrayInAscendingOrder_whenArrayHasNotDuplicates() {
        int[] ints = {5, 2, 8, 1, 7};
        int[] expected = {1, 2, 5, 7, 8};
        bubbleSortIntArrayInAscendingOrder(ints);
        assertArrayEquals(expected, ints);
    }

    @Test
    public void bubbleSortIntArrayInAscendingOrder_whenArrayHasDuplicates() {
        int[] ints = {5, 2, 8, 1, 8};
        int[] expected = {1, 2, 5, 8, 8};
        bubbleSortIntArrayInAscendingOrder(ints);
        assertArrayEquals(expected, ints);
    }

    @Test
    public void bubbleSortIntArrayInAscendingOrder_whenEmptyArray() {
        int[] ints = {};
        int[] expected = {};
        bubbleSortIntArrayInAscendingOrder(ints);
        assertArrayEquals(expected, ints);
    }

    @Test
    public void selectionSortIntArrayInAscendingOrder_whenArrayHasDuplicates() {
        int[] ints = {5, 2, 8, 1, 8};
        int[] expected = {1, 2, 5, 8, 8};
        selectionSortIntArrayInAscendingOrder(ints);
        assertArrayEquals(expected, ints);
    }

    @Test
    public void selectionSortIntArrayInAscendingOrder_whenArrayHasNotDuplicates() {
        int[] ints = {5, 2, 8, 1, 7};
        int[] expected = {1, 2, 5, 7, 8};
        selectionSortIntArrayInAscendingOrder(ints);
        assertArrayEquals(expected, ints);
    }

    @Test
    public void selectionSortIntArrayInAscendingOrder_whenEmptyArray() {
        int[] ints = {};
        int[] expected = {};
        selectionSortIntArrayInAscendingOrder(ints);
        assertArrayEquals(expected, ints);
    }

    @Test
    public void hasDuplicates_whenDuplicateBytes() {
        byte[] bytes = {1, 2, 3, 4, 4, 5};
        assertTrue(hasDuplicates(bytes));
    }

    @Test
    public void hasDuplicates_whenNotDuplicateBytes() {
        byte[] bytes = {1, 2, 3, 4, 6, 5};
        assertFalse(hasDuplicates(bytes));
    }

    @Test
    public void hasDuplicates_whenEmptyArray() {
        byte[] bytes = {};
        assertFalse(hasDuplicates(bytes));
    }

    @Test
    void multiplyArrays_whenArraysLengthsAreEqual() {
        int[] firstIntArray = {1, 2, 3};
        int[] secondIntArray = {4, 5, 6};
        int[] expected = {4, 10, 18};
        int[] actual = multiplyArrays(firstIntArray, secondIntArray);
        assertArrayEquals(expected, actual);
    }

    @Test
    void multiplyArrays_whenEmptyArrays() {
        int[] firstIntArray = {};
        int[] secondIntArray = {};
        int[] expected = {};
        int[] actual = multiplyArrays(firstIntArray, secondIntArray);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findNonMatchingElements_whenArrayLengthEqual() {
        int[] ints1 = {1, 2, 3, 4, 5};
        int[] ints2 = {1, 2, 3, 6, 7};
        int[] expected = {4, 6, 5, 7};
        int[] actual = findNonMatchingElements(ints1, ints2);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findNonMatchingElements_whenEmptyArrays() {
        int[] ints1 = {};
        int[] ints2 = {};
        int[] expected = {};
        int[] actual = findNonMatchingElements(ints1, ints2);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findNonMatchingElements_whenFirstEmptyArray() {
        int[] ints1 = {};
        int[] ints2 = {1, 2, 3};
        int[] expected = {1, 2, 3};
        int[] actual = findNonMatchingElements(ints1, ints2);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findNonMatchingElements_whenSecondEmptyArray() {
        int[] ints1 = {1, 2, 3};
        int[] ints2 = {};
        int[] expected = {1, 2, 3};
        int[] actual = findNonMatchingElements(ints1, ints2);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findNonMatchingElements_whenDifferentLengthArrays() {
        int[] ints1 = {1, 2, 3};
        int[] ints2 = {1, 2, 3, 4, 5};
        int[] expected = {4, 5};
        int[] actual = findNonMatchingElements(ints1, ints2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void reverseIntArray_whenNotEmptyArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] actual = reverseIntArray(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void reverseIntArray_whenEmptyArray() {
        int[] input = {};
        int[] expected = {};
        int[] actual = reverseIntArray(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void generateRandomArray_whenZeroSize() {
        int size = 0;
        int lowerBound = 1;
        int upperBound = 10;
        int[] actual = generateRandomArray(size, lowerBound, upperBound);
        assertEquals(0, actual.length);
    }

    @Test
    public void generateRandomArray_whenLowerBoundGreaterThanUpperBound() {
        int size = 5;
        int lowerBound = 10;
        int upperBound = 1;
        int[] actual = generateRandomArray(size, lowerBound, upperBound);
        assertEquals(0, actual.length);
    }

    @Test
    public void generateRandomArray_whenEqualBounds() {
        int size = 5;
        int lowerBound = 5;
        int upperBound = 5;
        int[] actual = generateRandomArray(size, lowerBound, upperBound);
        assertEquals(size, actual.length);
        for (int element : actual) {
            assertEquals(lowerBound, element);
        }
    }

    @Test
    public void generateRandomArray_whenUpperBoundGreaterThanLowerBound() {
        int size = 5;
        int lowerBound = 1;
        int upperBound = 10;
        int[] actual = generateRandomArray(size, lowerBound, upperBound);
        assertEquals(size, actual.length);
        for (int element : actual) {
            assertTrue(element >= lowerBound && element <= upperBound);
        }
    }

    @Test
    void isCharSubArray_whenFirstArrayIsLonger() {
        char[] chars1 = {'a', 'b', 'c', 'd', 'e'};
        char[] chars2 = {'c', 'd'};
        assertTrue(isCharSubArray(chars1, chars2));
    }

    @Test
    void isCharSubArray_whenSecondArrayIsLonger() {
        char[] chars1 = {'c', 'd'};
        char[] chars2 = {'a', 'b', 'c', 'd', 'e'};
        assertTrue(isCharSubArray(chars1, chars2));
    }

    @Test
    void isCharSubArray_whenFirstArrayIsEmpty() {
        char[] chars1 = {};
        char[] chars2 = {'c', 'd'};
        assertFalse(isCharSubArray(chars1, chars2));
    }

    @Test
    void isCharSubArray_whenSecondArrayIsEmpty() {
        char[] chars1 = {'c', 'd'};
        char[] chars2 = {};
        assertFalse(isCharSubArray(chars1, chars2));
    }

    @Test
    void isCharSubArray_whenEqualArrays() {
        char[] chars1 = {'a', 'b', 'c'};
        char[] chars2 = {'a', 'b', 'c'};
        assertTrue(isCharSubArray(chars1, chars2));
    }

    @Test
    void isCharSubArray_whenIsSubstring() {
        char[] chars1 = {'a', 'b', 'c', 'd', 'e'};
        char[] chars2 = {'b', 'c', 'd'};
        assertTrue(isCharSubArray(chars1, chars2));
    }

    @Test
    void isCharSubArray_whenNotSubstring() {
        char[] chars1 = {'a', 'b', 'c', 'd', 'e'};
        char[] chars2 = {'b', 'd', 'e'};
        assertFalse(isCharSubArray(chars1, chars2));
    }
}