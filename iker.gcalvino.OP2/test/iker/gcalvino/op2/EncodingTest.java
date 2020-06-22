package iker.gcalvino.op2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EncodingTest {

    public Encoding code = new Encoding();
    public String password = "abcdefghij";
    public String operation;

    @Test
    public void testSwapPositions() {
        operation = "SWP56";
        assertEquals("abcdegfhij", code.operate(password, operation));
        operation = "SWP68";
        assertEquals("abcdefihgj", code.operate(password, operation));
        operation = "SWP19";
        assertEquals("ajcdefghib", code.operate(password, operation));
        operation = "SWP21";
        assertEquals("acbdefghij", code.operate(password, operation));
        operation = "SWP55";
        assertEquals("abcdefghij", code.operate(password, operation));
    }

    @Test
    public void testSwapLetters() {
        operation = "SWLaa";
        assertEquals("abcdefghij", code.operate(password, operation));
        operation = "SWLie";
        assertEquals("abcdifghej", code.operate(password, operation));
        operation = "SWLfc";
        assertEquals("abfdecghij", code.operate(password, operation));
        operation = "SWLhg";
        assertEquals("abcdefhgij", code.operate(password, operation));
        operation = "SWLcg";
        assertEquals("abgdefchij", code.operate(password, operation));
    }

    @Test
    public void testRotateLeft() {
        operation = "ROL2";
        assertEquals("cdefghijab", code.operate(password, operation));
        operation = "ROL0";
        assertEquals("abcdefghij", code.operate(password, operation));
        operation = "ROL3";
        assertEquals("defghijabc", code.operate(password, operation));
        operation = "ROL9";
        assertEquals("jabcdefghi", code.operate(password, operation));
        operation = "ROL8";
        assertEquals("ijabcdefgh", code.operate(password, operation));
    }

    @Test
    public void testRotateRight() {
        operation = "ROR0";
        assertEquals("abcdefghij", code.operate(password, operation));
        operation = "ROR6";
        assertEquals("efghijabcd", code.operate(password, operation));
        operation = "ROR9";
        assertEquals("bcdefghija", code.operate(password, operation));
        operation = "ROR3";
        assertEquals("hijabcdefg", code.operate(password, operation));
        operation = "ROR7";
        assertEquals("defghijabc", code.operate(password, operation));
    }

    @Test
    public void testReversePositions() {
        operation = "REP10";
        assertEquals("bacdefghij", code.operate(password, operation));
        operation = "REP43";
        assertEquals("abcedfghij", code.operate(password, operation));
        operation = "REP33";
        assertEquals("abcdefghij", code.operate(password, operation));
        operation = "REP69";
        assertEquals("abcdefjihg", code.operate(password, operation));
        operation = "REP63";
        assertEquals("abcgfedhij", code.operate(password, operation));
    }

    @Test
    public void testMovePositions() {
        operation = "MOP47";
        assertEquals("abcdfgheij", code.operate(password, operation));
        operation = "MOP44";
        assertEquals("abcdefghij", code.operate(password, operation));
        operation = "MOP17";
        assertEquals("acdefghbij", code.operate(password, operation));
        operation = "MOP41";
        assertEquals("aebcdfghij", code.operate(password, operation));
        operation = "MOP89";
        assertEquals("abcdefghji", code.operate(password, operation));
    }

}
