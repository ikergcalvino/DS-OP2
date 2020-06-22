package iker.gcalvino.op2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DecodingTest {

    public Decoding decode = new Decoding();
    public String original = "abcdefghij";
    public String password;
    public String operation;

    @Test
    public void testSwapPositions() {
        operation = "SWP56";
        password = "abcdegfhij";
        assertEquals(original, decode.operate(password, operation));
        operation = "SWP68";
        password = "abcdefihgj";
        assertEquals(original, decode.operate(password, operation));
        operation = "SWP19";
        password = "ajcdefghib";
        assertEquals(original, decode.operate(password, operation));
        operation = "SWP21";
        password = "acbdefghij";
        assertEquals(original, decode.operate(password, operation));
        operation = "SWP55";
        password = "abcdefghij";
        assertEquals(original, decode.operate(password, operation));
    }

    @Test
    public void testSwapLetters() {
        operation = "SWLaa";
        password = "abcdefghij";
        assertEquals(original, decode.operate(password, operation));
        operation = "SWLie";
        password = "abcdifghej";
        assertEquals(original, decode.operate(password, operation));
        operation = "SWLfc";
        password = "abfdecghij";
        assertEquals(original, decode.operate(password, operation));
        operation = "SWLhg";
        password = "abcdefhgij";
        assertEquals(original, decode.operate(password, operation));
        operation = "SWLcg";
        password = "abgdefchij";
        assertEquals(original, decode.operate(password, operation));
    }

    @Test
    public void testRotateLeft() {
        operation = "ROL2";
        password = "cdefghijab";
        assertEquals(original, decode.operate(password, operation));
        operation = "ROL0";
        password = "abcdefghij";
        assertEquals(original, decode.operate(password, operation));
        operation = "ROL3";
        password = "defghijabc";
        assertEquals(original, decode.operate(password, operation));
        operation = "ROL9";
        password = "jabcdefghi";
        assertEquals(original, decode.operate(password, operation));
        operation = "ROL8";
        password = "ijabcdefgh";
        assertEquals(original, decode.operate(password, operation));
    }

    @Test
    public void testRotateRight() {
        operation = "ROR0";
        password = "abcdefghij";
        assertEquals(original, decode.operate(password, operation));
        operation = "ROR6";
        password = "efghijabcd";
        assertEquals(original, decode.operate(password, operation));
        operation = "ROR9";
        password = "bcdefghija";
        assertEquals(original, decode.operate(password, operation));
        operation = "ROR3";
        password = "hijabcdefg";
        assertEquals(original, decode.operate(password, operation));
        operation = "ROR7";
        password = "defghijabc";
        assertEquals(original, decode.operate(password, operation));
    }

    @Test
    public void testReversePositions() {
        operation = "REP10";
        password = "bacdefghij";
        assertEquals(original, decode.operate(password, operation));
        operation = "REP43";
        password = "abcedfghij";
        assertEquals(original, decode.operate(password, operation));
        operation = "REP33";
        password = "abcdefghij";
        assertEquals(original, decode.operate(password, operation));
        operation = "REP69";
        password = "abcdefjihg";
        assertEquals(original, decode.operate(password, operation));
        operation = "REP63";
        password = "abcgfedhij";
        assertEquals(original, decode.operate(password, operation));
    }

    @Test
    public void testMovePositions() {
        operation = "MOP47";
        password = "abcdfgheij";
        assertEquals(original, decode.operate(password, operation));
        operation = "MOP44";
        password = "abcdefghij";
        assertEquals(original, decode.operate(password, operation));
        operation = "MOP17";
        password = "acdefghbij";
        assertEquals(original, decode.operate(password, operation));
        operation = "MOP41";
        password = "aebcdfghij";
        assertEquals(original, decode.operate(password, operation));
        operation = "MOP89";
        password = "abcdefghji";
        assertEquals(original, decode.operate(password, operation));
    }

}
