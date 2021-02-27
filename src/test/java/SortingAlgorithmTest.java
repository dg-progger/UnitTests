import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;


public class SortingAlgorithmTest {

    @Test
    public void simpleTest() {
        int[] j = {5, 7, 44, 16, 12};
        int[] expectedArray = {5, 7, 12, 16, 44};
        SortingAlgorithm.sort(j);
        Assertions.assertArrayEquals(expectedArray, j);
    }

    @Test
    public void ifSameNumbersTest() {
        int[] j = {5, 7, 5, 7, 7};
        int[] expectedArray = {5, 5, 7, 7, 7};
        SortingAlgorithm.sort(j);
        Assertions.assertArrayEquals(expectedArray, j);
    }

    @Test
    public void ifCharsTest1() {
        int[] j = {5, 7, 0, '0', 4};
        int[] expectedArray = {0, 4, 5, 7, '0'};
        SortingAlgorithm.sort(j);
        Assertions.assertArrayEquals(expectedArray, j);
    }

    @Test
    public void ifCharsTest2() {
        int[] j = {'1', 1, 0};
        int[] expectedArray = {0, 1, '1'};
        SortingAlgorithm.sort(j);
        Assertions.assertArrayEquals(expectedArray, j);
    }

    @Test
    public void ifAllCharsTest1() {
        int[] j = {'5','+','3','=', '8'};
        int[] expectedArray = {'+','3','5','8','='};
        SortingAlgorithm.sort(j);
        Assertions.assertArrayEquals(expectedArray, j);
    }

    @Test
    public void ifAllCharsTest2() {
        int[] j = {'5','+','3','=', '8'};
        int[] expectedArray = {43,51,53,56,61};
        SortingAlgorithm.sort(j);
        Assertions.assertArrayEquals(expectedArray, j);
    }

    @Test
    public void binaryToIntTest() {
        int[] j = {Integer.parseInt("00101100", 2), Integer.parseInt("10000", 2), Integer.parseInt("0101", 2), Integer.parseInt("0111", 2), Integer.parseInt("1100", 2)};
        int[] expectedArray = {5, 7, 12, 16, 44};
        SortingAlgorithm.sort(j);
        Assertions.assertArrayEquals(expectedArray, j);
    }

    @Test
    public void intToBinaryTest() {
        int[] j = {12, 44, 5, 16, 7};
        int[] expectedArray = {Integer.parseInt("0101", 2), Integer.parseInt("0111", 2), Integer.parseInt("1100", 2), Integer.parseInt("10000", 2), Integer.parseInt("00101100", 2)};
        SortingAlgorithm.sort(j);
        Assertions.assertArrayEquals(expectedArray, j);
    }

    @Test
    public void fractionalNumbersTest() {
        int[] j = {60/4, 49/7, 36/3, 12/4};
        int[] expectedArray = {3, 7, 12, 15};
        SortingAlgorithm.sort(j);
        Assertions.assertArrayEquals(expectedArray, j);
    }

    @Test
    public void zerosTest() {
        int[] j = {0, 0};
        int[] expectedArray = {0, 0};
        SortingAlgorithm.sort(j);
        Assertions.assertArrayEquals(expectedArray, j);
    }

    @Test
    public void stringToIntTest() {
        int[] j = {Integer.parseInt("24"), Integer.parseInt("17"),Integer.parseInt("45"),Integer.parseInt("103"),Integer.parseInt("2"),};
        int[] expectedArray = {2, 17, 24, 45, 103};
        SortingAlgorithm.sort(j);
        Assertions.assertArrayEquals(expectedArray, j);
    }

    @Test
    public void intToStringTest() {
        int[] j = {24, 17, 45, 103, 2};
        int[] expectedArray = {Integer.parseInt("2"), Integer.parseInt("17"),Integer.parseInt("24"),Integer.parseInt("45"),Integer.parseInt("103"),};
        SortingAlgorithm.sort(j);
        Assertions.assertArrayEquals(expectedArray, j);
    }

}
