package org.huseyin;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by huseyin on 14/09/2017.
 */
public class CalculatorTest {
    @Test
    public void additionOfTwoIntegersShouldReturnSumOfThem() {
        Calculator calc = new Calculator();

        // assert statements
        assertEquals("1 + 2 must be 3", 3, calc.add(1, 2));
        assertEquals("1 + 0 must be 1", 1, calc.add(1, 0));
    }
}
