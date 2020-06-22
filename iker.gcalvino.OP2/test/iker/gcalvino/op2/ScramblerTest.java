package iker.gcalvino.op2;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ScramblerTest {

    public static List<String> basicoperations = Arrays.asList("SWP 4 0", "SWL d b", "REP 0 4", "ROL 1", "MOP 1 4", "ROR 3");

    @Test
    public void testEncodePasswordBasic() {
        Scrambler scrambler = new Scrambler();
        assertEquals("eacbd", scrambler.encodePassword("abcde", basicoperations));
    }

    @Test
    public void testDecodePasswordBasic() {
        Scrambler scrambler = new Scrambler();
        assertEquals("abcde", scrambler.decodePassword("eacbd", basicoperations));
    }

}
