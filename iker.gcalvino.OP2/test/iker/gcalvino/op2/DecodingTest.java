package iker.gcalvino.op2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DecodingTest {

    public Operation operator;
    public String original = "abcdefghij";

    @Test
    public void testSwapPositions() {
        operator = new SWP("abcdegfhij", 5, 6);
        assertEquals(original, operator.decode());
        operator = new SWP("abcdefihgj", 6, 8);
        assertEquals(original, operator.decode());
        operator = new SWP("ajcdefghib", 1, 9);
        assertEquals(original, operator.decode());
        operator = new SWP("acbdefghij", 2, 1);
        assertEquals(original, operator.decode());
        operator = new SWP("abcdefghij", 5, 5);
        assertEquals(original, operator.decode());
    }

    @Test
    public void testSwapLetters() {
        operator = new SWL("abcdefghij", 'a', 'a');
        assertEquals(original, operator.decode());
        operator = new SWL("abcdifghej", 'i', 'e');
        assertEquals(original, operator.decode());
        operator = new SWL("abfdecghij", 'f', 'c');
        assertEquals(original, operator.decode());
        operator = new SWL("abcdefhgij", 'h', 'g');
        assertEquals(original, operator.decode());
        operator = new SWL("abgdefchij", 'c', 'g');
        assertEquals(original, operator.decode());
    }

    @Test
    public void testRotateLeft() {
        operator = new ROL("cdefghijab", 2);
        assertEquals(original, operator.decode());
        operator = new ROL("abcdefghij", 0);
        assertEquals(original, operator.decode());
        operator = new ROL("defghijabc", 3);
        assertEquals(original, operator.decode());
        operator = new ROL("jabcdefghi", 9);
        assertEquals(original, operator.decode());
        operator = new ROL("ijabcdefgh", 8);
        assertEquals(original, operator.decode());
    }

    @Test
    public void testRotateRight() {
        operator = new ROR("abcdefghij", 0);
        assertEquals(original, operator.decode());
        operator = new ROR("efghijabcd", 6);
        assertEquals(original, operator.decode());
        operator = new ROR("bcdefghija", 9);
        assertEquals(original, operator.decode());
        operator = new ROR("hijabcdefg", 3);
        assertEquals(original, operator.decode());
        operator = new ROR("defghijabc", 7);
        assertEquals(original, operator.decode());
    }

    @Test
    public void testReversePositions() {
        operator = new REP("bacdefghij", 1, 0);
        assertEquals(original, operator.decode());
        operator = new REP("abcedfghij", 4, 3);
        assertEquals(original, operator.decode());
        operator = new REP("abcdefghij", 3, 3);
        assertEquals(original, operator.decode());
        operator = new REP("abcdefjihg", 6, 9);
        assertEquals(original, operator.decode());
        operator = new REP("abcgfedhij", 6, 3);
        assertEquals(original, operator.decode());
    }

    @Test
    public void testMovePositions() {
        operator = new MOP("abcdfgheij", 4, 7);
        assertEquals(original, operator.decode());
        operator = new MOP("abcdefghij", 4, 4);
        assertEquals(original, operator.decode());
        operator = new MOP("acdefghbij", 1, 7);
        assertEquals(original, operator.decode());
        operator = new MOP("aebcdfghij", 4, 1);
        assertEquals(original, operator.decode());
        operator = new MOP("abcdefghji", 8, 9);
        assertEquals(original, operator.decode());
    }

}
