package math;

import org.junit.Assert;
import org.junit.Test;

public class MathMultiplyTest {
    @Test
    public void testMultiplyPositiveNumbers() {
        int [] numbers = {1, 2, 3};

        final int result = Math.multiplyNumbers(numbers);

        Assert.assertEquals(6, result);
    }

    @Test
    public void testMultiplyNegativeNumbers() {
        int [] numbers = {1, -2, 3};

        final int result = Math.multiplyNumbers(numbers);

        Assert.assertEquals(-6, result);
    }

    @Test
    public void testMultiplyNumbersWithZero() {
        int [] numbers = {1, 2, 3, 125, 23, 0};

        final int result = Math.multiplyNumbers(numbers);

        Assert.assertEquals(0, result);
    }
}
