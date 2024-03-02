package com.honcharenko;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;

import static com.honcharenko.TwentyMethods.*;
import static org.junit.jupiter.api.Assertions.*;

class TwentyMethodsTest {

    @Test
    void printCharArray_whenSystemOut() {
        char[] chars = {'e', 'b', '@', '&', '^'};
        String expectedOutput = "eb@&^";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        printCharArray(chars);
        assertEquals(expectedOutput, outputStream.toString().trim());
    }

    @Test
    void getCharArrayFromIntArray_whenValidInput() {
        int[] ints = {1000, 2000, 3000, 4000, 5000};
        char[] expected = {'Ϩ', 'ߐ', 'ஸ', 'ྠ', 'ᎈ'};
        char[] result = getCharArrayFromIntArray(ints);
        assertArrayEquals(expected, result);
    }

    @Test
    public void getCharArrayFromIntArray_whenEmptyInput() {
        int[] ints = {};
        char[] expected = {};
        char[] result = getCharArrayFromIntArray(ints);
        assertArrayEquals(expected, result);
    }

    @Test
    void getMaxInt_whenTwoNumbersInputAndFirstNumberIsGreater() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expected = 10;
        int result = getMaxInt(firstNumber, secondNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxInt_whenTwoNumbersInputAndSecondNumberIsGreater() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expected = 10;
        int result = getMaxInt(firstNumber, secondNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxInt_whenTwoNumbersInputAndNumbersAreEqual() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expected = 10;
        int result = getMaxInt(firstNumber, secondNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxIntWithTernary_whenFirstNumberIsGreater() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expected = 10;
        int result = getMaxIntWithTernary(firstNumber, secondNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxIntWithTernary_whenSecondNumberIsGreater() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expected = 10;
        int result = getMaxIntWithTernary(firstNumber, secondNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxIntWithTernary_whenNumbersAreEqual() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expected = 10;
        int result = getMaxIntWithTernary(firstNumber, secondNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxIntWithBranching_whenFirstNumberIsGreater() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expected = 10;
        int result = getMaxIntWithBranching(firstNumber, secondNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxIntWithBranching_whenSecondNumberIsGreater() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expected = 10;
        int result = getMaxIntWithBranching(firstNumber, secondNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxIntWithBranching_whenNumbersAreEqual() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expected = 10;
        int result = getMaxIntWithBranching(firstNumber, secondNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxInt_whenThreeNumbersInputAndFirstNumberIsGreater() {
        int firstNumber = 15;
        int secondNumber = 10;
        int thirdNumber = 5;
        int expected = 15;
        int result = getMaxInt(firstNumber, secondNumber, thirdNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxInt_whenThreeNumbersInputAndSecondNumberIsGreater() {
        int firstNumber = 10;
        int secondNumber = 15;
        int thirdNumber = 5;
        int expected = 15;
        int result = getMaxInt(firstNumber, secondNumber, thirdNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxInt_whenThreeNumbersInputAndThirdNumberIsGreater() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 15;
        int expected = 15;
        int result = getMaxInt(firstNumber, secondNumber, thirdNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxInt_whenThreeNumbersInputAndNumbersAreEqual() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expected = 10;
        int result = getMaxInt(firstNumber, secondNumber, thirdNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxInt_whenFiveNumbersInputAndFirstNumberIsGreater() {
        int firstNumber = 25;
        int secondNumber = 10;
        int thirdNumber = 15;
        int fourthNumber = 20;
        int fifthNumber = 5;
        int expected = 25;
        int result = getMaxInt(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxInt_whenFiveNumbersInputAndSecondNumberIsGreater() {
        int firstNumber = 10;
        int secondNumber = 25;
        int thirdNumber = 15;
        int fourthNumber = 20;
        int fifthNumber = 5;
        int expected = 25;
        int result = getMaxInt(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxInt_whenFiveNumbersInputAndThirdNumberIsGreater() {
        int firstNumber = 15;
        int secondNumber = 10;
        int thirdNumber = 25;
        int fourthNumber = 20;
        int fifthNumber = 5;
        int expected = 25;
        int result = getMaxInt(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxInt_whenFiveNumbersInputAndFourthNumberIsGreater() {
        int firstNumber = 20;
        int secondNumber = 10;
        int thirdNumber = 15;
        int fourthNumber = 25;
        int fifthNumber = 5;
        int expected = 25;
        int result = getMaxInt(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxInt_whenFiveNumbersInputAndFifthNumberIsGreater() {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 15;
        int fourthNumber = 20;
        int fifthNumber = 25;
        int expected = 25;
        int result = getMaxInt(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
        assertEquals(expected, result);
    }

    @Test
    void getMaxInt_whenFiveNumbersInputAndNumbersAreEqual() {
        int firstNumber = 25;
        int secondNumber = 25;
        int thirdNumber = 25;
        int fourthNumber = 25;
        int fifthNumber = 25;
        int expected = 25;
        int result = getMaxInt(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
        assertEquals(expected, result);
    }

    @Test
    void getStringFromCharArray_whenSingleCharacter() {
        char[] chars = {'$'};
        String expected = "$";
        String result = getStringFromCharArray(chars);
        assertEquals(expected, result);
    }

    @Test
    void getStringFromCharArray_whenMultipleCharacters() {
        char[] chars = {'&', '^', '$', '#', '@', '!', '|'};
        String expected = "&^$#@!|";
        String result = getStringFromCharArray(chars);
        assertEquals(expected, result);
    }

    @Test
    void getStringFromCharArray_whenEmptyArray() {
        char[] chars = {};
        String expected = "";
        String result = getStringFromCharArray(chars);
        assertEquals(expected, result);
    }

    @Test
    void findFirstIndexOfSearchingValueInArray_whenValueExists() {
        int[] ints = {12, 34, 678, 3456, 8976, 12};
        int searchValue = 678;
        int result = findFirstIndexOfSearchingValueInArray(ints, searchValue);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    void findFirstIndexOfSearchingValueInArray_whenValueNotExists() {
        int[] ints = {12, 34, 678, 3456, 8976, 12};
        int searchValue = 1;
        int result = findFirstIndexOfSearchingValueInArray(ints, searchValue);
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    void findFirstIndexOfSearchingValueInArray_whenEmptyArray() {
        int[] ints = {};
        int searchValue = 1;
        int result = findFirstIndexOfSearchingValueInArray(ints, searchValue);
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    void findLastIndexOfSearchingValueInArray_whenValueExists() {
        int[] ints = {12, 34, 678, 3456, 8976, 12};
        int searchValue = 12;
        int result = findLastIndexOfSearchingValueInArray(ints, searchValue);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    void findLastIndexOfSearchingValueInArray_whenValueNotExists() {
        int[] ints = {12, 34, 678, 3456, 8976, 12};
        int searchValue = 1;
        int result = findLastIndexOfSearchingValueInArray(ints, searchValue);
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    void findLastIndexOfSearchingValueInArray_whenEmptyArray() {
        int[] ints = {};
        int searchValue = 1;
        int result = findLastIndexOfSearchingValueInArray(ints, searchValue);
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    void calculateFactorial_whenPositiveNumber() {
        int number = 9;
        int expected = 362880;
        int result = calculateFactorial(number);
        assertEquals(expected, result);
    }

    @Test
    void calculateFactorial_whenNumberIsZero() {
        int number = 0;
        int expected = 1;
        int result = calculateFactorial(number);
        assertEquals(expected, result);
    }

    @Test
    void calculateFactorialRecursive_whenPositiveNumber() {
        int number = 5;
        BigInteger expected = BigInteger.valueOf(120);
        BigInteger result = calculateFactorialRecursive(number);
        assertEquals(expected, result);
    }

    @Test
    void calculateFactorialRecursive_whenNumberIsZero() {
        int number = 0;
        BigInteger expected = BigInteger.ONE;
        BigInteger result = calculateFactorialRecursive(number);
        assertEquals(expected, result);
    }

    @Test
    void calculateFactorialRecursive_whenLargeNumberInResult() {
        int number = 100;
        BigInteger expected = new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000");
        BigInteger result = calculateFactorialRecursive(number);
        assertEquals(expected, result);
    }

    @Test
    void isLeapYear_whenYearIsLeap() {
        int year = 2024;
        boolean result = isLeapYear(year);
        assertTrue(result);
    }

    @Test
    void isLeapYear_whenYearIsNotLeap() {
        int year = 2023;
        boolean result = isLeapYear(year);
        assertFalse(result);
    }

    @Test
    void isLeapYear_whenYearDivisibleBy100AndNotDivisibleBy400() {
        int year = 1700;
        boolean result = isLeapYear(year);
        assertFalse(result);
    }

    @Test
    public void filterIntArrayMultiples_whenArrayNotEmpty() {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = 2;
        String expectedOutput = "2\n4\n6\n8\n10\n";
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
    public void selectionSortIntArrayInAscendingOrder_whenEmptyArray() {
        int[] ints = {};
        int[] expected = {};
        selectionSortIntArrayInAscendingOrder(ints);
        assertArrayEquals(expected, ints);
    }

    @Test
    public void hasDuplicates_whenDuplicateBytes() {
        byte[] bytes = {1, 2, 3, 4, 4, 5};
        boolean expected = true;
        boolean result = hasDuplicates(bytes);
        assertEquals(expected, result);
    }

    @Test
    public void hasDuplicates_whenNotDuplicateBytes() {
        byte[] bytes = {1, 2, 3, 4, 4, 5};
        boolean expected = true;
        boolean result = hasDuplicates(bytes);
        assertEquals(expected, result);
    }

    @Test
    public void hasDuplicates_whenEmptyArray() {
        byte[] bytes = {};
        boolean expected = false;
        boolean result = hasDuplicates(bytes);
        assertEquals(expected, result);
    }

    @Test
    void multiplyArrays_whenArraysLengthsAreEqual() {
        int[] firstIntArray = {1, 2, 3};
        int[] secondIntArray = {4, 5, 6};
        int[] expected = {4, 10, 18};

        int[] result = multiplyArrays(firstIntArray, secondIntArray);

        assertArrayEquals(expected, result);
    }

    @Test
    void multiplyArrays_whenEmptyArrays() {
        int[] firstIntArray = {};
        int[] secondIntArray = {};
        int[] expected = {};

        int[] result = multiplyArrays(firstIntArray, secondIntArray);

        assertArrayEquals(expected, result);
    }

    @Test
    void findNonMatchingElements_whenArrayLengthEqual() {
        int[] ints1 = {1, 2, 3, 4, 5};
        int[] ints2 = {1, 2, 3, 6, 7};
        int[] expected = {4, 6, 5, 7};
        int[] result = findNonMatchingElements(ints1, ints2);
        assertArrayEquals(expected, result);
    }

    @Test
    void findNonMatchingElements_whenEmptyArrays() {
        int[] ints1 = {};
        int[] ints2 = {};
        int[] expected = {};
        int[] result = findNonMatchingElements(ints1, ints2);
        assertArrayEquals(expected, result);
    }

    @Test
    void findNonMatchingElements_whenOneEmptyArray() {
        int[] ints1 = {1, 2, 3};
        int[] ints2 = {};
        int[] expected = {1, 2, 3};
        int[] result = findNonMatchingElements(ints1, ints2);
        assertArrayEquals(expected, result);
    }

    @Test
    void findNonMatchingElements_whenDifferentLengthArrays() {
        int[] ints1 = {1, 2, 3};
        int[] ints2 = {1, 2, 3, 4, 5};
        int[] expected = {4, 5};
        int[] result = findNonMatchingElements(ints1, ints2);
        assertArrayEquals(expected, result);
    }

    @Test
    public void reverseIntArray_whenNotEmptyArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] result = reverseIntArray(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void reverseIntArray_whenEmptyArray() {
        int[] input = {};
        int[] expected = {};
        int[] result = reverseIntArray(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void generateRandomArray_whenEmptySize() {
        int size = 0;
        int lowerBound = 1;
        int upperBound = 10;
        int[] result = generateRandomArray(size, lowerBound, upperBound);
        assertEquals(0, result.length);
    }

    @Test
    public void generateRandomArray_whenLowerBoundGreaterThanUpperBound() {
        int size = 5;
        int lowerBound = 10;
        int upperBound = 1;
        int[] result = generateRandomArray(size, lowerBound, upperBound);
        assertEquals(0, result.length);
    }

    @Test
    public void generateRandomArray_whenEqualBounds() {
        int size = 5;
        int lowerBound = 5;
        int upperBound = 5;
        int[] result = generateRandomArray(size, lowerBound, upperBound);
        assertEquals(size, result.length);
        for (int element : result) {
            assertEquals(lowerBound, element);
        }
    }

    @Test
    public void generateRandomArray_whenUpperBoundGreaterThanLowerBound() {
        int size = 5;
        int lowerBound = 1;
        int upperBound = 10;
        int[] result = generateRandomArray(size, lowerBound, upperBound);
        assertEquals(size, result.length);
        for (int element : result) {
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
    void isCharSubArray_whenOneFromArraysAreEmpty() {
        char[] chars1 = {};
        char[] chars2 = {'c', 'd'};
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