package code401Challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test public void testbinarySearch(){
        BinarySearch classForTesting = new BinarySearch();
        int target = 15;
        int []arr = new int[]{4,8,15,16,23,42};
        int low = 0;
        int high = arr.length -1;
        int expectedOutput = 2;

        assertEquals("This search should give an output of two.",
                expectedOutput, classForTesting.binarySearch(arr, target));
    }

    @Test public void testbinarySearchNotThere(){
        BinarySearch classForTesting = new BinarySearch();
        int target = 90;
        int []arr = new int[]{11,22,33,44,55,66,77};
        int low = 0;
        int high = arr.length -1;
        int expectedOutput = -1;

        assertEquals("This search should give an output of negative one.",
                expectedOutput, classForTesting.binarySearch(arr, target));
    }
}
