package code401Challenges.hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void testHashTable(){
        Hashtable hashtable = new Hashtable();
        int hashKeyTest = hashtable.hash("test");
        assertEquals(320, hashKeyTest);
    }

    @Test
    public void testAdd(){
        Hashtable hashtable = new Hashtable();
        hashtable.add("Test", "test");
        String expectedOutput = "test";
        assertTrue(hashtable.get("Test").equals(expectedOutput));
    }

    @Test
    public void testAddMany(){
        Hashtable hashtable = new Hashtable();
        hashtable.add("Test", "test");
        hashtable.add("Wonky", "wonky");
        hashtable.add("Test2", "test2");
        String expectedOutput = "test2";
        assertTrue(hashtable.get("Test2").equals(expectedOutput));
    }

    @Test
    public void testContains(){
        Hashtable hashtable = new Hashtable();
        hashtable.add("Test", "test");

        assertTrue(hashtable.contains("Test"));
    }

    @Test
    public void testContainsMany(){
        Hashtable hashtable = new Hashtable();
        hashtable.add("Test", "test");
        hashtable.add("Wonky", "wonky");
        hashtable.add("Test2", "test2");

        assertTrue(hashtable.contains("Wonky"));
    }

    @Test
    public void testContainsEmpty(){
        Hashtable hashtable = new Hashtable();
        hashtable.add("Test", "test");

        assertFalse(hashtable.contains("Test2"));
    }

    @Test
    public void testGet_Empty(){
        Hashtable hashtable = new Hashtable();
        assertNull(hashtable.get("Wonky"));
    }
}