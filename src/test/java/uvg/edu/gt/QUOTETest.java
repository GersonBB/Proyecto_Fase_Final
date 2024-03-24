package uvg.edu.gt;

import static org.junit.jupiter.api.Assertions.*;

class QUOTETest {

    @org.junit.jupiter.api.Test
    void quote() {
        String imp = "(QUOTE (A B C D E F G)";
        String expected = "(A B C D E F G )";
        String result = QUOTE.quote(imp);
        assertEquals(expected, result);
    }

}