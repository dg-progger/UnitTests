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
    public void zerosTest() {
        int[] j = {0, 0};
        int[] expectedArray = {0, 0};
        SortingAlgorithm.sort(j);
        Assertions.assertArrayEquals(expectedArray, j);
    }

    @Test
    public void ifNegativeNumbersTest() {
        int[] j = {-5, 7, 0, 14, -97};
        int[] expectedArray = {-97, -5, 0, 7, 14};
        SortingAlgorithm.sort(j);
        Assertions.assertArrayEquals(expectedArray, j);
    }

    @Test
    public void ifBorderNumbersTest() {
        int[] j = {-2147483648, 2147483647, 0, -2147483648, 3};
        int[] expectedArray = {-2147483648, -2147483648, 0, 3, 2147483647};
        SortingAlgorithm.sort(j);
        Assertions.assertArrayEquals(expectedArray, j);
    }

    @Test
    public void ifAlreadySortedNumbersTest() {
        int[] j = {-2, -1, 0, 0, 1, 2, 3, 4, 5};
        int[] expectedArray = {-2, -1, 0, 0, 1, 2, 3, 4, 5};
        SortingAlgorithm.sort(j);
        Assertions.assertArrayEquals(expectedArray, j);
    }

    @Test
    public void ifEmptyArrayTest() {
        int[] j = {};
        int[] expectedArray = {};
        SortingAlgorithm.sort(j);
        Assertions.assertArrayEquals(expectedArray, j);
    }

}
