package code401Challenges.repeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void testStringShort(){

        String test = "Once upon a time, there was a brave princess who...";
        String expected = "a";

        assertTrue(RepeatedWord.repeatedWord(test).equals(expected));
    }

    @Test
    public void testStringLong(){

        String test = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of " +
                "foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light," +
                " it was the season of Darkness, it was the spring of hope, it was the winter of despair... ";
        String expected = "it";

        assertTrue(RepeatedWord.repeatedWord(test).equals(expected));
    }

    @Test
    public void testStringNoRepeat(){

        String test = "Once upon a time, there was nothing.";

        assertNull(RepeatedWord.repeatedWord(test));
    }

    @Test
    public void testStringOneWord(){

        String test = "Once";

        assertNull(RepeatedWord.repeatedWord(test));
    }

    @Test
    public void testStringEmpty(){

        String test = "Once";

        assertNull(RepeatedWord.repeatedWord(test));
    }

}