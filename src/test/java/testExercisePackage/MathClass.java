package testExercisePackage;

import org.junit.Assert;
import org.junit.Test;


public class MathClass {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        MultiplyClass tester = new MultiplyClass(); // MyClass is tested

        // assert statements
        Assert.assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
    }

    @Test
    public void multiplicationOfIntegersShouldReturnResultOfMultiplication() {
        MultiplyClass tester = new MultiplyClass(); // MyClass is tested

        // assert statements
        Assert.assertEquals("-2 multiplié par 2 doit donner -4",-4,tester.multiply(-2,2));
        Assert.assertEquals("3 multiplié par -3 doit donner -9",-9,tester.multiply(3,-3));
        Assert.assertEquals("4 multiplié par 4 doit donner 16",16,tester.multiply(4,4));
        Assert.assertEquals("-5 multiplié par -5 doit donner 25",25,tester.multiply(-5,-5));
        
    }

    @Test (expected = IllegalArgumentException.class) 
    public void multiplicationOfTooBigXShouldThrowException() {
        MultiplyClass tester = new MultiplyClass(); // MyClass is tested
        tester.multiply(1000, 0);
    }

    @Test 
    public void multiplicationOfX999ShouldNotThrowException() {
        MultiplyClass tester = new MultiplyClass(); // MyClass is tested
        Assert.assertEquals("999 multiplié par 1 doit donner 999",999,tester.multiply(999,1));
    }

    @Test
    public void multiplicationOfTooBigXShouldThrowExceptionTryCatch() {
    try {
        MultiplyClass tester = new MultiplyClass(); // MyClass is tested
        tester.multiply(1000, 0);
        Assert.fail("Should throw exception for x > 999");
    }
    catch(IllegalArgumentException aExp) {
        assert(aExp.getMessage().contains("X should be less than 1000"));
    }
}
}

