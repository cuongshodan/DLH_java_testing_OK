package testExercisePackage;

import org.junit.Assert;
import org.junit.Test;


public class MathClass {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        MultiplyClass tester = new MultiplyClass(); // MyClass is tested

        // assert statements
        Assert.assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
        Assert.assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
        Assert.assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
        
    }
}