import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class repeatedStringSolutionTest {
    @Test
    public void firstString() {
        repeatedStringSolution tester = new repeatedStringSolution();
        assertEquals(tester.repeatedString("aba",10),7);
    }

    @Test
    public void secondString() {
        repeatedStringSolution tester = new repeatedStringSolution();
        assertEquals(tester.repeatedString("a",1000000000),1000000000);
    }
}