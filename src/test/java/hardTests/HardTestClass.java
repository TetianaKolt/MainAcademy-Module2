package hardTests;

import application.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardTestClass {

    Calculator calc = new Calculator();

    //TODO (**)
    //add tests for new method - divide by zero case
    @Test
    public void testDivideByZeroCase() {
        double a = 5;
        double b = 0;
        double expectedResult = -100;
        double actualResult = calc.divideByZeroCase(a, b);
        Assert.assertEquals(actualResult, expectedResult, "When dividing " + a + " on " + b + " expected result is " + expectedResult);
    }


    //TODO (**)
    //add tests for new method - addition with multiple parameters
    @Test
    public void testSumOfMultipleParams() {
        int a = 5;
        int b = 5;
        int c = 10;
        int expectedResult = 20;
        int actualResult = calc.sumOfMultipleParams(a, b, c);
        Assert.assertEquals(actualResult, expectedResult, "When adding " + a + " " + b +" and " +c+ " expected result is " + expectedResult);
    }
    
    @Test
    public void testGetPercentCount(){
        double number = 200;
        double percent = 15;
        double expectedResult = 30;
        double actualResult = calc.getPercentCount(number,percent);
        Assert.assertEquals(actualResult, expectedResult, "When calculating "+percent+" percent of "+ number+", the result is "+expectedResult);
    }

    @Test
    public void testGetPercentCount(){
        double number = 100;
        double percent = 15;
        double expectedResult = 15;
        double actualResult = calc.getPercentCount(number,percent);
        Assert.assertEquals(actualResult, expectedResult, "When calculating "+percent+" percent of "+ number+", the result is "+expectedResult);
    }

}
