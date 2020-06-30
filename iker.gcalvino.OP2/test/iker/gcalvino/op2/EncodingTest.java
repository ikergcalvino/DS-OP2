package iker.gcalvino.op2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EncodingTest {

    public Operation operator;
    public String password = "abcdefghij";

    @Test
    public void testSwapPositions() {
        operator = new SWP(password, 5, 6);
        assertEquals("abcdegfhij", operator.encode());
        operator = new SWP(password, 6, 8);
        assertEquals("abcdefihgj", operator.encode());
        operator = new SWP(password, 1, 9);
        assertEquals("ajcdefghib", operator.encode());
        operator = new SWP(password, 2, 1);
        assertEquals("acbdefghij", operator.encode());
        operator = new SWP(password, 5, 5);
        assertEquals("abcdefghij", operator.encode());
    }

    @Test
    public void testSwapLetters() {
        operator = new SWL(password, 'a', 'a');
        assertEquals("abcdefghij", operator.encode());
        operator = new SWL(password, 'i', 'e');
        assertEquals("abcdifghej", operator.encode());
        operator = new SWL(password, 'f', 'c');
        assertEquals("abfdecghij", operator.encode());
        operator = new SWL(password, 'h', 'g');
        assertEquals("abcdefhgij", operator.encode());
        operator = new SWL(password, 'c', 'g');
        assertEquals("abgdefchij", operator.encode());
    }

    @Test
    public void testRotateLeft() {
        operator = new ROL(password, 2);
        assertEquals("cdefghijab", operator.encode());
        operator = new ROL(password, 0);
        assertEquals("abcdefghij", operator.encode());
        operator = new ROL(password, 3);
        assertEquals("defghijabc", operator.encode());
        operator = new ROL(password, 9);
        assertEquals("jabcdefghi", operator.encode());
        operator = new ROL(password, 8);
        assertEquals("ijabcdefgh", operator.encode());
    }

    @Test
    public void testRotateRight() {
        operator = new ROR(password, 0);
        assertEquals("abcdefghij", operator.encode());
        operator = new ROR(password, 6);
        assertEquals("efghijabcd", operator.encode());
        operator = new ROR(password, 9);
        assertEquals("bcdefghija", operator.encode());
        operator = new ROR(password, 3);
        assertEquals("hijabcdefg", operator.encode());
        operator = new ROR(password, 7);
        assertEquals("defghijabc", operator.encode());
    }

    @Test
    public void testReversePositions() {
        operator = new REP(password, 1, 0);
        assertEquals("bacdefghij", operator.encode());
        operator = new REP(password, 4, 3);
        assertEquals("abcedfghij", operator.encode());
        operator = new REP(password, 3, 3);
        assertEquals("abcdefghij", operator.encode());
        operator = new REP(password, 6, 9);
        assertEquals("abcdefjihg", operator.encode());
        operator = new REP(password, 6, 3);
        assertEquals("abcgfedhij", operator.encode());
    }

    @Test
    public void testMovePositions() {
        operator = new MOP(password, 4, 7);
        assertEquals("abcdfgheij", operator.encode());
        operator = new MOP(password, 4, 4);
        assertEquals("abcdefghij", operator.encode());
        operator = new MOP(password, 1, 7);
        assertEquals("acdefghbij", operator.encode());
        operator = new MOP(password, 4, 1);
        assertEquals("aebcdfghij", operator.encode());
        operator = new MOP(password, 8, 9);
        assertEquals("abcdefghji", operator.encode());
    }

}
