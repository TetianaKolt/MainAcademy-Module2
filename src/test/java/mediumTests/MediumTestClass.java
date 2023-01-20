package mediumTests;

import application.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MediumTestClass {

    Calculator calc = new Calculator();

    //TODO (**)
//add tests for new method - average value
    @Test (groups = {"Smoke"})
    public void testAverageValue() {
        int a = 5;
        int b = 5;
        int c = 5;
        double expectedResult = 5;
        double actualResult = calc.averageValue(a, b, c);
        Assert.assertEquals(actualResult, expectedResult, "When finding average result of " + a + " " + b + " and " + c + " expected result is " + expectedResult);
    }

    //TODO (**)
//add tests for new method - even or odd
    @Test
    public void testEvenOrOdd() {
        int a = 2;
        boolean expectedResult = true;
        boolean actualResult = calc.evenOrOdd(a);
        Assert.assertEquals(actualResult, expectedResult, "True is for even numbers. And for number " + a + " expected result is " + expectedResult);
    }

//TODO (**)
//add tests for new method - biggest value

    @Test
    public void testBiggestValue() {
        int a = 1;
        int b = 10;
        int expectedResult = b;
        int actualResult = calc.biggestValue(a, b);
        Assert.assertEquals(actualResult, expectedResult, "When finding the biggest value among " + a + " and " + b + " expected result is " + expectedResult);
    }

}