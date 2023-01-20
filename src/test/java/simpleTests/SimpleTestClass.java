package simpleTests;

import application.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SimpleTestClass {

    Calculator calc = new Calculator();

    @Test (groups = {"Regression"})
    public void testAddTwoPositiveValues() {
        int a = 10;
        int b = 5;
        int expectedResult = 15;
        int actualResult = calc.add(a, b);
        Assert.assertEquals(actualResult,expectedResult,"When adding " + a +" and "+b+" expected result is "+expectedResult);

    }

    // TODO (*)
    //add tests for new methods (multiply, division, subtraction, square root, x^2)
    @Test
    public void testSubtract() {
        int a = 10;
        int b = 5;
        int expectedResult = 5;
        int actualResult = calc.subtract(a, b);
        Assert.assertEquals(actualResult,expectedResult,"When subtracting " + b +" from "+a+" expected result is "+expectedResult);

    }


    @Test
    public void testMultiply() {
        int a = 2;
        int b = 5;
        int expectedResult = 10;
        int actualResult = calc.multiply(a, b);
        Assert.assertEquals(actualResult,expectedResult,"When multiplying " + a +" and "+b+" expected result is "+expectedResult);

    }
    @Test
    public void testDivide() {
        double a = 20;
        double b = 5;
        double expectedResult = 4;
        double actualResult = calc.divide(a, b);
        Assert.assertEquals(actualResult,expectedResult,"When dividing " + a +" on "+b+" expected result is "+expectedResult);

    }
    @Test
    public void testSquareRoot() {
        double a = 4;
        double expectedResult = 2;
        double actualResult = calc.squareRoot(a);
        Assert.assertEquals(actualResult,expectedResult,"When calculating square root of " + a +" expected result is "+expectedResult);

    }
    @Test
    public void testExponentiate() {
        double a = 20;
        double exponatiateFor = 2;
        double expectedResult = 400;
        double actualResult = calc.exponentiate(a, exponatiateFor);
        Assert.assertEquals(actualResult,expectedResult,"When exponentiation " + a +" in exponent "+ exponatiateFor+" expected result is "+expectedResult);

    }

}
