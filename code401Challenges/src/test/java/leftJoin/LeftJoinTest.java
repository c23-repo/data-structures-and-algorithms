package leftJoin;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void testLeftJoin(){
        HashMap<String, String> hashMapA = new HashMap<>();
        HashMap<String, String> hashMapB = new HashMap<>();

        hashMapA.put("fond", "enamored");
        hashMapA.put("wrath", "anger");
        hashMapA.put("diligent", "employed");
        hashMapA.put("outfit", "garb");
        hashMapA.put("guide", "usher");

        hashMapB.put("fond", "averse");
        hashMapB.put("wrath", "delight");
        hashMapB.put("diligent", "idle");
        hashMapB.put("guide", "follow");
        hashMapB.put("flow", "jam");

        ArrayList<ArrayList<String>> test = new ArrayList<>();
        test.add(new ArrayList<String>(Arrays.asList("diligent", "employed", "idle")));
        test.add(new ArrayList<String>(Arrays.asList("outfit", "garb", null)));
        test.add(new ArrayList<String>(Arrays.asList("wrath", "anger", "delight")));
        test.add(new ArrayList<String>(Arrays.asList("guide", "usher", "follow")));
        test.add(new ArrayList<String>(Arrays.asList("fond", "enamored", "averse")));

        assertEquals(test, LeftJoin.leftJoin(hashMapA, hashMapB));
    }
}