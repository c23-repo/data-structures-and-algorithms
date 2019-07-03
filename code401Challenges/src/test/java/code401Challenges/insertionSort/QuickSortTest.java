package code401Challenges.insertionSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {


    @Test
    public void testQuickSort_EvenLength() {

        int [] arr = new int[]{5, 6, 1, 4, 8, 3};
        int [] expectedOutput = new int[]{1, 3, 4, 5, 6, 8};
        QuickSort.quickSort(arr);
        assertArrayEquals(expectedOutput, arr);

    }

    @Test
    public void testQuickSort_EvenLength_Negative(){

        int [] arr = new int[]{3, -6, 1, 4, -8, 9};
        int [] expectedOutput = new int[]{-8, -6, 1, 3, 4, 9};
        QuickSort.quickSort(arr);
        assertArrayEquals(expectedOutput, arr);
    }

    @Test
    public void testQuickSort_UnevenLength() {

        int [] arr = new int[]{5, 6, 1, 4, 8, 3};
        int [] expectedOutput = new int[]{1, 3, 4, 5, 6, 8};
        QuickSort.quickSort(arr);
        assertArrayEquals(expectedOutput, arr);

    }

    @Test
    public void testQuickSort_UnevenLength_Negative(){

        int [] arr = new int[]{3, -6, 1, 4, -8, 9};
        int [] expectedOutput = new int[]{-8, -6, 1, 3, 4, 9};
        QuickSort.quickSort(arr);
        assertArrayEquals(expectedOutput, arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArray(){
        int [] arr = new int[]{};
        QuickSort.quickSort(arr);
    }
}