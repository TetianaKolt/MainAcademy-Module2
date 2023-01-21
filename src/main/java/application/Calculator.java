package application;

public class Calculator {

    //***************Simple methods************************

    public int add(int a, int b) {
        return a + b;
    }

    //TODO add method for subtraction

    public int subtract(int a, int b) {
        return a - b;
    }

    //TODO add method for multiplication

    public int multiply(int a, int b) {
        return a * b;
    }

    //TODO add method for division
    public double divide(double a, double b) {
        return a / b;
    }

    //TODO add method for square root (use Math class)
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    //TODO add method for x^2
    public double exponentiate(double a, double exponent) {
        return Math.pow(a, exponent);
    }

    //***************Medium methods************************

    //TODO (*) |average value| add method which calculate average value of 3 numbers
    public double averageValue(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    //TODO (*) |even or odd| add method which get 1 number as parameter and return true if it even, and false - if odd
    public boolean evenOrOdd(int a) {
        return a % 2 == 0;
    }

    //TODO (*) |biggest value| add method which get 2 number as parameters and return bigger of them, or 0 if they equals
    public int biggestValue(int a, int b) {
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            return 0;
        }
    }


    //***************Hard methods************************

    //TODO (**) |addition with multiple parameters| add method which return sum of any quantity of parameter
    public int sumOfMultipleParams(int ... b) {
        int sum = 0;
        for (int number:b) {
            sum+=number;
        }
        return sum;
    }


    //TODO (*) |divide by zero case| add method for division (check division by zero case
    // - if we try to divide by zero - return -100;

    public double divideByZeroCase(double a, double b) {
        if(b == 0){
            return -100;
        }
        return a/b;
    }
    
   public double getPercentCount(double yourNumber, double percent) {
        double percentOfYourNumber = (yourNumber*percent)/100;
        return percentOfYourNumber;
    }
}






