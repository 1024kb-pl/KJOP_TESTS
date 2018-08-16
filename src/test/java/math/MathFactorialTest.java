package math;

import org.junit.Assert;
import org.junit.Test;

public class MathFactorialTest {

    @Test
    public void testFactorialWithLowNumber() {
        int n = 3;

        final int result = Math.factorial(n);

        Assert.assertEquals(6, result);
    }

    @Test
    public void testFactorialWithHightNumber() {
        int n = 10;

        final int result = Math.factorial(n);

        Assert.assertEquals(3628800, result);
    }

    @Test
    public void testFactorialOfOne() {
        int n = 1;

        final int result = Math.factorial(n);

        Assert.assertEquals(1, result);
    }
}
