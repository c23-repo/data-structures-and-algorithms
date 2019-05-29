package code401Challenges;

import org.junit.Test;
import static org.junit.Assert.*;


public class ArrayShiftTest {

    @Test public void testInsertShiftArray() {
        ArrayShift classForTesting = new ArrayShift();
        int v = 5;
        int []arr = new int[]{1, 2, 3, 4};
        int []expectedOutput = new int[]{1, 2, 5, 3, 4};

        assertArrayEquals("This array has a new value inserted into the middle",
                expectedOutput, classForTesting.insertShiftArray(arr, v));
    }

    @Test public void testArrayWithOddLength(){
        ArrayShift classForTesting = new ArrayShift();
        int v = 5;
        int []arr = new int[]{1, 2, 3, 4, 5};
        int []expectedOutput = new int[]{1, 2, 5, 3, 4, 5};

        assertArrayEquals("This array has a new value inserted into the middle",
                expectedOutput, classForTesting.insertShiftArray(arr, v));
    }

}


