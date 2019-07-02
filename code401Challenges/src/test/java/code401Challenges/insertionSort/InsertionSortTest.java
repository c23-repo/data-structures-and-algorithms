package code401Challenges.insertionSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void testInsertionSort(){
        InsertionSort is = new InsertionSort();
        int [] arr = new int[]{5, 6, 1, 4, 8};
        int [] expectedOutput = new int[]{1, 4, 5, 6, 8};
        is.InsertionSort(arr);
        assertArrayEquals(expectedOutput, arr);
    }

    @Test
    public void testInsertionSortNegative(){
        InsertionSort is = new InsertionSort();
        int [] arr = new int[]{-5, 6, 1, -4, 8};
        int [] expectedOutput = new int[]{-5, -4, 1, 6, 8};
        is.InsertionSort(arr);
        assertArrayEquals(expectedOutput, arr);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testInsertionSortEmpty(){
        InsertionSort is = new InsertionSort();
        int [] arr = new int[]{};
        is.InsertionSort(arr);
    }

}