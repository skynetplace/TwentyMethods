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
        OutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // when
        printCharArray(chars);
        // then
        assertEquals("eb@&^", outputStream.toString());
    }

    @Test
    void givenEmptyCharArray_whenPrintCharArray_thenPrintToConsole() {
        // given
        char[] chars = {};
        OutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // when
        printCharArray(chars);
        // then
        assertEquals("", outputStream.toString());
    }

    @Test
    void givenIntArray_whenGetCharArrayFromIntArray_thenReturnCharArray() {
        // given
        int[] ints = {1000, 2000, 3000, 4000, 5000};
        // when
        char[] actual = getCharArrayFromIntArray(ints);
        // then
        assertArrayEquals(new char[]{'Ϩ', 'ߐ', 'ஸ', 'ྠ', 'ᎈ'}, actual);
    }

    @Test
    void givenEmptyIntArray_whenGetCharArrayFromIntArray_thenReturnEmptyCharArray() {
        // given
        int[] ints = {};
        // when
        char[] actual = getCharArrayFromIntArray(ints);
        // then
        assertArrayEquals(new char[]{}, actual);
    }

    @Test
    void givenTwoIntsAndFirstIsGreater_whenGetMaxInt_thenReturnFirst() {
        // given
        int firstInt = 10;
        int secondInt = 5;
        // when
        int actual = getMaxInt(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenTwoIntsAndSecondIsGreater_whenGetMaxInt_thenReturnSecond() {
        // given
        int firstInt = 5;
        int secondInt = 10;
        // when
        int actual = getMaxInt(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenTwoEqualInts_whenGetMaxInt_thenReturnOneOfThem() {
        // given
        int firstInt = 10;
        int secondInt = 10;
        // when
        int actual = getMaxInt(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenTwoIntsAndFirstIsGreater_whenGetMaxIntWithTernary_thenReturnFirst() {
        // given
        int firstInt = 10;
        int secondInt = 5;
        // when
        int actual = getMaxIntWithTernary(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenTwoIntsAndSecondIsGreater_whenGetMaxIntWithTernary_thenReturnSecond() {
        // given
        int firstInt = 5;
        int secondInt = 10;
        // when
        int actual = getMaxIntWithTernary(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenTwoEqualInts_whenGetMaxIntWithTernary_thenReturnOneOfThem() {
        //given
        int firstInt = 10;
        int secondInt = 10;
        // when
        int actual = getMaxIntWithTernary(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenTwoIntsAndFirstIsGreater_whenMaxIntWithBranching_thenReturnFirst() {
        // given
        int firstInt = 10;
        int secondInt = 5;
        // when
        int actual = getMaxIntWithBranching(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenTwoIntsAndSecondIsGreater_whenGetMaxIntWithBranching_thenReturnSecond() {
        // given
        int firstInt = 5;
        int secondInt = 10;
        // when
        int actual = getMaxIntWithBranching(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenTwoEqualInts_whenGetMaxIntWithBranching_thenReturnOneOfThem() {
        // given
        int firstInt = 10;
        int secondInt = 10;
        // when
        int actual = getMaxIntWithBranching(firstInt, secondInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenThreeIntsAndFirstIsGreater_whenGetMaxInt_thenReturnFirst() {
        // given
        int firstInt = 15;
        int secondInt = 10;
        int thirdInt = 5;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt);
        // then
        assertEquals(15, actual);
    }

    @Test
    void givenThreeIntsAndSecondIsGreater_whenGetMaxInt_thenReturnSecond() {
        // given
        int firstInt = 10;
        int secondInt = 15;
        int thirdInt = 5;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt);
        // then
        assertEquals(15, actual);
    }

    @Test
    void givenThreeIntsAndThirdIsGreater_whenGetMaxInt_thenReturnThird() {
        // given
        int firstInt = 5;
        int secondInt = 10;
        int thirdInt = 15;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt);
        // then
        assertEquals(15, actual);
    }

    @Test
    void givenThreeEqualInts_whenGetMaxInt_thenReturnOneOfThem() {
        // given
        int firstInt = 10;
        int secondInt = 10;
        int thirdInt = 10;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt);
        // then
        assertEquals(10, actual);
    }

    @Test
    void givenFiveIntsAndFirstIsGreater_whenGetMaxInt_thenReturnFirst() {
        // given
        int firstInt = 25;
        int secondInt = 10;
        int thirdInt = 15;
        int fourthInt = 20;
        int fifthInt = 5;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt, fourthInt, fifthInt);
        // then
        assertEquals(25, actual);
    }

    @Test
    void givenFiveIntsAndSecondIsGreater_whenGetMaxInt_thenReturnSecond() {
        // given
        int firstInt = 10;
        int secondInt = 25;
        int thirdInt = 15;
        int fourthInt = 20;
        int fifthInt = 5;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt, fourthInt, fifthInt);
        // then
        assertEquals(25, actual);
    }

    @Test
    void givenFiveIntsAndThirdIsGreater_whenGetMaxInt_thenReturnThird() {
        // given
        int firstInt = 15;
        int secondInt = 10;
        int thirdInt = 25;
        int fourthInt = 20;
        int fifthInt = 5;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt, fourthInt, fifthInt);
        // then
        assertEquals(25, actual);
    }

    @Test
    void givenFiveIntsAndFourthIsGreater_whenGetMaxInt_thenReturnFourth() {
        // given
        int firstInt = 20;
        int secondInt = 10;
        int thirdInt = 15;
        int fourthInt = 25;
        int fifthInt = 5;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt, fourthInt, fifthInt);
        // then
        assertEquals(25, actual);
    }

    @Test
    void givenFiveIntsAndFifthIsGreater_whenGetMaxInt_thenReturnFifth() {
        // given
        int firstInt = 5;
        int secondInt = 10;
        int thirdInt = 15;
        int fourthInt = 20;
        int fifthInt = 25;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt, fourthInt, fifthInt);
        // then
        assertEquals(25, actual);
    }

    @Test
    void givenFiveEqualInts_whenGetMaxInt_thenReturnOneOfThem() {
        // given
        int firstInt = 25;
        int secondInt = 25;
        int thirdInt = 25;
        int fourthInt = 25;
        int fifthInt = 25;
        // when
        int actual = getMaxInt(firstInt, secondInt, thirdInt, fourthInt, fifthInt);
        // then
        assertEquals(25, actual);
    }

    @Test
    void givenCharArrayWithOneCharacter_whenGetStringFromCharArray_thenReturnStringWithOneCharacter() {
        // given
        char[] chars = {'$'};
        // when
        String actual = getStringFromCharArray(chars);
        // then
        assertEquals("$", actual);
    }

    @Test
    void givenCharArray_whenGetStringFromCharArray_thenReturnString() {
        // given
        char[] chars = {'&', '^', '$', '#', '@', '!', '|'};
        // when
        String actual = getStringFromCharArray(chars);
        // then
        assertEquals("&^$#@!|", actual);
    }

    @Test
    void givenEmptyCharArray_whenGetStringFromCharArray_thenReturnExpectedString() {
        // given
        char[] chars = {};
        // when
        String actual = getStringFromCharArray(chars);
        // then
        assertEquals("", actual);
    }

    @Test
    void givenIntArrayAndExistingInArrayWithDuplicatesValue_whenFindFirstIndexOfSearchValueInArray_thenReturnFirstIndexOfSearchValue() {
        // given
        int[] ints = {12, 34, 678, 3456, 1, 8976, 12};
        int searchValue = 12;
        // when
        int actual = findFirstIndexOfSearchValueInArray(ints, searchValue);
        // then
        assertEquals(0, actual);
    }

    @Test
    void givenIntArrayAndExistingInArrayWithoutDuplicatesValue_whenFindFirstIndexOfSearchValueInArray_thenReturnFirstIndexOfSearchValue() {
        // given
        int[] ints = {12, 34, 678, 3456, 1, 8976};
        int searchValue = 1;
        // when
        int actual = findFirstIndexOfSearchValueInArray(ints, searchValue);
        // then
        assertEquals(4, actual);
    }

    @Test
    void givenIntArrayAndNotExistingInArrayValue_whenFindFirstIndexOfSearchValueInArray_thenReturnMinusOne() {
        // given
        int[] ints = {12, 34, 678, 3456, 8976, 12};
        int searchValue = 1;
        // when
        int actual = findFirstIndexOfSearchValueInArray(ints, searchValue);
        // then
        assertEquals(-1, actual);
    }

    @Test
    void givenEmptyIntArrayAndIntValue_whenFindFirstIndexOfSearchValueInArray_thenReturnMinusOne() {
        // given
        int[] ints = {};
        int searchValue = 1;
        // when
        int actual = findFirstIndexOfSearchValueInArray(ints, searchValue);
        // then
        assertEquals(-1, actual);
    }

    @Test
    void givenIntArrayAndExistingInArrayWithDuplicatesValue_whenFindLastIndexOfSearchValueInArray_thenReturnLastIndexOfSearchValue() {
        // given
        int[] ints = {12, 34, 678, 3456, 1, 8976, 12};
        int searchValue = 12;
        // when
        int actual = findLastIndexOfSearchValueInArray(ints, searchValue);
        // then
        assertEquals(6, actual);
    }

    @Test
    void givenIntArrayAndExistingInArrayWithoutDuplicatesValue_whenFindLastIndexOfSearchValueInArray_thenReturnLastIndexOfSearchValue() {
        // given
        int[] ints = {12, 34, 678, 3456, 1, 8976};
        int searchValue = 1;
        // when
        int actual = findLastIndexOfSearchValueInArray(ints, searchValue);
        // then
        assertEquals(4, actual);
    }

    @Test
    void givenIntArrayAndNotExistingInArrayValue_whenFindLastIndexOfSearchValueInArray_thenReturnMinusOne() {
        // given
        int[] ints = {12, 34, 678, 3456, 8976, 12};
        int searchValue = 1;
        // when
        int actual = findLastIndexOfSearchValueInArray(ints, searchValue);
        // then
        assertEquals(-1, actual);
    }

    @Test
    void givenEmptyIntArrayAndIntValue_whenFindLastIndexOfSearchValueInArray_thenReturnMinusOne() {
        // given
        int[] ints = {};
        int searchValue = 1;
        // when
        int actual = findLastIndexOfSearchValueInArray(ints, searchValue);
        // then
        assertEquals(-1, actual);
    }

    @Test
    void givenInt_whenCalculateFactorial_thenReturnFactorial() {
        // given
        int natural = 9;
        // when
        int actual = calculateFactorial(natural);
        // then
        assertEquals(362880, actual);
    }

    @Test
    void givenZero_whenCalculateFactorial_thenReturnOne() {
        // given
        int natural = 0;
        // when
        int actual = calculateFactorial(natural);
        // then
        assertEquals(1, actual);
    }

    @Test
    void givenInt_whenCalculateFactorialRecursive_thenReturnFactorial() {
        // given
        int natural = 5;
        // when
        BigInteger actual = calculateFactorialRecursive(natural);
        // then
        assertEquals(BigInteger.valueOf(120), actual);
    }

    @Test
    void givenZero_whenCalculateFactorialRecursive_thenReturnOne() {
        // given
        int natural = 0;
        // when
        BigInteger actual = calculateFactorialRecursive(natural);
        // then
        assertEquals(BigInteger.ONE, actual);
    }

    @Test
    void givenInt_whenCalculateFactorialRecursive_thenReturnBigFactorial() {
        // given
        int natural = 100;
        // when
        BigInteger actual = calculateFactorialRecursive(natural);
        // then
        assertEquals(new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"), actual);
    }

    @Test
    void givenIntAsLeapYear_whenIsLeapYear_thenReturnTrue() {
        // given
        int year = 2024;
        // when
        boolean actual = isLeapYear(year);
        // then
        assertTrue(actual);
    }

    @Test
    void givenIntAsNotLeapYear_whenIsLeapYear_thenReturnFalse() {
        // given
        int year = 2023;
        // when
        boolean actual = isLeapYear(year);
        // then
        assertFalse(actual);
    }

    @Test
    void givenIntAsNotLeapYearDivisibleBy100AndNotDivisibleBy400_whenIsLeapYear_thenReturnFalse() {
        // given
        int year = 1700;
        // when
        boolean actual = isLeapYear(year);
        // then
        assertFalse(actual);
    }

    @Test
    void givenIntArrayAndIntDivider_whenFilterIntArrayMultiples_thenReturnExpectedString() {
        // given
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int divider = 2;
        OutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // when
        filterIntArrayMultiples(ints, divider);
        // then
        assertEquals("2" + System.lineSeparator() + "4" + System.lineSeparator() + "6" + System.lineSeparator() + "8" + System.lineSeparator() + "10" + System.lineSeparator(), outputStream.toString());
    }

    @Test
    void givenEmptyIntArrayAndDivide_whenFilterIntArrayMultiples_thenReturnExpectedString() {
        // given
        int[] ints = {};
        int divider = 2;
        OutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        // when
        filterIntArrayMultiples(ints, divider);
        // then
        assertEquals("", outputStream.toString());
    }

    @Test
    void givenIntArrayWithoutDuplicates_whenBubbleSortIntArrayInAscendingOrder_thenReturnSortedIntArray() {
        // given
        int[] ints = {5, 2, 8, 1, 7};
        // when
        bubbleSortIntArrayInAscendingOrder(ints);
        // then
        assertArrayEquals(new int[]{1, 2, 5, 7, 8}, ints);
    }

    @Test
    void givenIntArrayWithDuplicates_whenBubbleSortIntArrayInAscendingOrder_thenReturnSortedIntArray() {
        // given
        int[] ints = {5, 2, 8, 1, 8};
        // when
        bubbleSortIntArrayInAscendingOrder(ints);
        // then
        assertArrayEquals(new int[]{1, 2, 5, 8, 8}, ints);
    }

    @Test
    void givenEmptyIntArray_whenBubbleSortIntArrayInAscendingOrder_thenReturnEmptyIntArray() {
        // given
        int[] ints = {};
        // when
        bubbleSortIntArrayInAscendingOrder(ints);
        // then
        assertArrayEquals(new int[]{}, ints);
    }

    @Test
    public void givenIntArrayWithDuplicates_whenSelectionSortIntArrayInAscendingOrder_thenReturnSortedIntArray() {
        // given
        int[] ints = {5, 2, 8, 1, 8};
        // when
        selectionSortIntArrayInAscendingOrder(ints);
        // then
        assertArrayEquals(new int[]{1, 2, 5, 8, 8}, ints);
    }

    @Test
    void givenIntArrayWithoutDuplicates_whenSelectionSortIntArrayInAscendingOrder_thenReturnSortedIntArray() {
        // given
        int[] ints = {5, 2, 8, 1, 7};
        // when
        selectionSortIntArrayInAscendingOrder(ints);
        // then
        assertArrayEquals(new int[]{1, 2, 5, 7, 8}, ints);
    }

    @Test
    void givenEmptyIntArray_whenSelectionSortIntArrayInAscendingOrder_thenReturnEmptyIntArray() {
        // given
        int[] ints = {};
        // when
        selectionSortIntArrayInAscendingOrder(ints);
        // then
        assertArrayEquals(new int[]{}, ints);
    }

    @Test
    void givenByteArrayWithDuplicates_whenHasDuplicates_thenReturnTrue() {
        // given
        byte[] bytes = {1, 2, 3, 4, 4, 5};
        // then
        assertTrue(hasDuplicates(bytes));
    }

    @Test
    void givenByteArrayWithoutDuplicates_whenHasDuplicates_thenReturnFalse() {
        // given
        byte[] bytes = {1, 2, 3, 4, 6, 5};
        // then
        assertFalse(hasDuplicates(bytes));
    }

    @Test
    void givenEmptyByteArray_whenHasDuplicates_thenReturnFalse() {
        // given
        byte[] bytes = {};
        // then
        assertFalse(hasDuplicates(bytes));
    }

    @Test
    void givenTwoIntArraysWithEqualLength_whenMultiplyArrays_thenReturnMultipliedArray() {
        // given
        int[] firstIntArray = {1, 2, 3};
        int[] secondIntArray = {4, 5, 6};
        // when
        int[] actual = multiplyArrays(firstIntArray, secondIntArray);
        // then
        assertArrayEquals(new int[]{4, 10, 18}, actual);
    }

    @Test
    void givenTwoEmptyIntArrays_whenMultiplyArrays_thenReturnEmptyArray() {
        // given
        int[] firstIntArray = {};
        int[] secondIntArray = {};
        // when
        int[] actual = multiplyArrays(firstIntArray, secondIntArray);
        // then
        assertArrayEquals(new int[]{}, actual);
    }

    @Test
    void givenTwoIntArraysWithEqualLength_whenFindNonMatchingElements_thenReturnArrayWithoutIndexMatchingElements() {
        // given
        int[] ints1 = {1, 2, 3, 4, 5};
        int[] ints2 = {1, 2, 3, 6, 7};
        // when
        int[] actual = findNonMatchingElements(ints1, ints2);
        // then
        assertArrayEquals(new int[]{4, 6, 5, 7}, actual);
    }

    @Test
    void givenTwoEmptyIntArrays_whenFindNonMatchingElements_thenReturnEmptyArray() {
        // given
        int[] ints1 = {};
        int[] ints2 = {};
        // when
        int[] actual = findNonMatchingElements(ints1, ints2);
        // then
        assertArrayEquals(new int[]{}, actual);
    }

    @Test
    void givenTwoIntArraysAndFirstIsEmpty_whenFindNonMatchingElements_thenReturnArrayWithoutIndexMatchingElements() {
        // given
        int[] ints1 = {};
        int[] ints2 = {1, 2, 3};
        // when
        int[] actual = findNonMatchingElements(ints1, ints2);
        // then
        assertArrayEquals(new int[]{1, 2, 3}, actual);
    }

    @Test
    void givenTwoIntArraysAndSecondIsEmpty_whenFindNonMatchingElements_thenReturnArrayWithoutIndexMatchingElements() {
        // given
        int[] ints1 = {1, 2, 3};
        int[] ints2 = {};
        // when
        int[] actual = findNonMatchingElements(ints1, ints2);
        // then
        assertArrayEquals(new int[]{1, 2, 3}, actual);
    }

    @Test
    void givenTwoIntArraysWithDifferentLength_whenFindNonMatchingElements_thenReturnArrayWithoutIndexMatchingElements() {
        // given
        int[] ints1 = {1, 2, 3};
        int[] ints2 = {1, 2, 3, 4, 5};
        // when
        int[] actual = findNonMatchingElements(ints1, ints2);
        // then
        assertArrayEquals(new int[]{4, 5}, actual);
    }

    @Test
    void givenIntArray_whenReverseIntArray_thenReturnReversedArray() {
        // given
        int[] input = {1, 2, 3, 4, 5};
        // when
        int[] actual = reverseIntArray(input);
        // then
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, actual);
    }

    @Test
    void givenEmptyIntArray_whenReverseIntArray_thenReturnEmptyArray() {
        // given
        int[] input = {};
        // when
        int[] actual = reverseIntArray(input);
        // then
        assertArrayEquals(new int[]{}, actual);
    }

    @Test
    void givenThreeIntsAndSizeIsZero_whenGenerateRandomArray_thenReturnZeroSizeIntArray() {
        // given
        int size = 0;
        int lowerBound = 1;
        int upperBound = 10;
        // when
        int[] actual = generateRandomArray(size, lowerBound, upperBound);
        // then
        assertEquals(0, actual.length);
    }

    @Test
    void givenThreeIntsAndLowerBoundGreaterThenUpperBound_whenGenerateRandomArray_thenReturnZeroSizeIntArray() {
        // given
        int size = 5;
        int lowerBound = 10;
        int upperBound = 1;
        // when
        int[] actual = generateRandomArray(size, lowerBound, upperBound);
        // then
        assertEquals(0, actual.length);
    }

    @Test
    void givenThreeIntsAndLowerBoundEqualUpperBound_whenGenerateRandomArray_thenReturnIntArrayWithEqualElements() {
        // given
        int size = 5;
        int lowerBound = 5;
        int upperBound = 5;
        // when
        int[] actual = generateRandomArray(size, lowerBound, upperBound);
        // then
        assertEquals(size, actual.length);
        for (int element : actual) {
            assertEquals(lowerBound, element);
        }
    }

    @Test
    void givenThreeIntsAndUpperBoundGreaterThanLowerBound_whenGenerateRandomArray_thenReturnGeneratedIntArray() {
        // given
        int size = 5;
        int lowerBound = 1;
        int upperBound = 10;
        // when
        int[] actual = generateRandomArray(size, lowerBound, upperBound);
        // then
        assertEquals(size, actual.length);
        for (int element : actual) {
            assertTrue(element >= lowerBound && element <= upperBound);
        }
    }

    @Test
    void givenTwoCharArraysAndFirstArrayIsLonger_whenIsCharSubArray_thenReturnTrue() {
        // given
        char[] chars1 = {'a', 'b', 'c', 'd', 'e'};
        char[] chars2 = {'b', 'c', 'd'};
        // then
        assertTrue(isCharSubArray(chars1, chars2));
    }

    @Test
    void givenTwoCharArraysAndFirstArrayIsLonger_whenIsCharSubArray_thenReturnFalse() {
        // given
        char[] chars1 = {'a', 'b', 'c', 'd', 'e'};
        char[] chars2 = {'b', 'd', 'e'};
        // then
        assertFalse(isCharSubArray(chars1, chars2));
    }

    @Test
    void givenTwoCharArraysAndSecondArrayIsLonger_whenIsCharSubArray_thenReturnTrue() {
        // given
        char[] chars1 = {'c', 'd'};
        char[] chars2 = {'a', 'b', 'c', 'd', 'e'};
        // then
        assertTrue(isCharSubArray(chars1, chars2));
    }

    @Test
    void givenTwoCharArraysAndFirstArrayIsEmpty_whenIsCharSubArray_thenReturnFalse() {
        // given
        char[] chars1 = {};
        char[] chars2 = {'c', 'd'};
        // then
        assertFalse(isCharSubArray(chars1, chars2));
    }

    @Test
    void givenTwoCharArraysAndSecondArrayIsEmpty_whenIsCharSubArray_thenReturnFalse() {
        // given
        char[] chars1 = {'c', 'd'};
        char[] chars2 = {};
        // then
        assertFalse(isCharSubArray(chars1, chars2));
    }

    @Test
    void givenTwoCharArraysAndArraysAreEqual_whenIsCharSubArray_thenReturnTrue() {
        // given
        char[] chars1 = {'a', 'b', 'c'};
        char[] chars2 = {'a', 'b', 'c'};
        // then
        assertTrue(isCharSubArray(chars1, chars2));
    }
}