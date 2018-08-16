package math;

import org.junit.Assert;
import org.junit.Test;

public class MathMinTest {
    @Test
    public void testFindMinInPositiveNumbers() {
        //is
        int [] numbers = {0, 12, 3, 4, 8, 9, 55, 12, 99, 101};

        //then
        final int result = Math.findMin(numbers);

        //excepted
        Assert.assertEquals(0, result);
    }

    @Test
    public void testFindMinInNegativeNumbers() {
        //is
        int [] numbers = {0, -12, -3, 4, 8, 9, -55, 15, -99};

        //then
        final int result = Math.findMin(numbers);

        //excepted
        Assert.assertEquals(-99, result);
    }

    @Test
    public void testFindMinInOneItem() {
        //is
        int [] numbers = {0};

        //then
        final int result = Math.findMin(numbers);

        //excepted
        Assert.assertEquals(0, result);

    }
}
