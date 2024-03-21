package uvg.edu.gt;

import org.junit.Assert;
import org.junit.Test;

public class CONDTest {

    @Test
    public void testCalculo() {
        boolean result = COND.Calculo("2 3 <");
        Assert.assertTrue(result);
    }
}