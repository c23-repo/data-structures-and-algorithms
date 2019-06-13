package code401Challenges.multibracketvalidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void multiBracketValidation_onePair() {
        MultiBracketValidation tester = new MultiBracketValidation();

        assertTrue(tester.multiBracketValidation("()"));
    }

    @Test
    public void multiBracketValidation_twoPair() {
        MultiBracketValidation tester = new MultiBracketValidation();

        assertTrue(tester.multiBracketValidation("({})"));
    }

    @Test
    public void multiBracketValidation_threePair() {
        MultiBracketValidation tester = new MultiBracketValidation();

        assertTrue(tester.multiBracketValidation("()[]{}"));
    }

    @Test
    public void multiBracketValidation_mixedPair() {
        MultiBracketValidation tester = new MultiBracketValidation();

        assertTrue(tester.multiBracketValidation("({}[])"));
    }

    @Test
    public void multiBracketValidation_wordsAndPairs() {
        MultiBracketValidation tester = new MultiBracketValidation();

        assertTrue(tester.multiBracketValidation("[TEST this{()}]"));
    }

    @Test
    public void multiBracketValidation_nonSequentialPair() {
        MultiBracketValidation tester = new MultiBracketValidation();

        assertFalse(tester.multiBracketValidation("({)}"));
    }

    @Test
    public void multiBracketValidation_closingPairFirst() {
        MultiBracketValidation tester = new MultiBracketValidation();

        assertFalse(tester.multiBracketValidation("({}[]][)"));
    }
}