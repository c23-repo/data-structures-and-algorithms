package code401Challenges.insertionSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void testMergeSort_EvenLength() {

        int [] arr = new int[]{5, 6, 1, 4, 8, 3};
        int [] expectedOutput = new int[]{1, 3, 4, 5, 6, 8};
        MergeSort.mergeSort(arr);
        assertArrayEquals(expectedOutput, arr);

    }

    @Test
    public void testMergeSort_EvenLength_Negative(){

        int [] arr = new int[]{3, -6, 1, 4, -8, 9};
        int [] expectedOutput = new int[]{-8, -6, 1, 3, 4, 9};
        MergeSort.mergeSort(arr);
        assertArrayEquals(expectedOutput, arr);
    }

    @Test
    public void testMergeSort_UnevenLength() {

        int [] arr = new int[]{5, 6, 1, 4, 8, 3};
        int [] expectedOutput = new int[]{1, 3, 4, 5, 6, 8};
        MergeSort.mergeSort(arr);
        assertArrayEquals(expectedOutput, arr);

    }

    @Test
    public void testMergeSort_UnevenLength_Negative(){

        int [] arr = new int[]{3, -6, 1, 4, -8, 9};
        int [] expectedOutput = new int[]{-8, -6, 1, 3, 4, 9};
        MergeSort.mergeSort(arr);
        assertArrayEquals(expectedOutput, arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyArray(){
        int [] arr = new int[]{};
        MergeSort.mergeSort(arr);
    }

}