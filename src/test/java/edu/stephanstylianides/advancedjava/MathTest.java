package edu.stephanstylianides.advancedjava;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathTest{

    private Math classTest;

    /**
     * This code is used to setup a known state or baseline
     * It is executed before every test
     */
    @Before
    public void setup() {

        classTest = new Math();

    }

    @Test
    public void testAdd() {
        double result = 10.0 + 23.0 + (-1.0) + 16.0;
        // Compare that to what Math gives us
        Assert.assertEquals(result, classTest.add(10.0, 23.0, -1.0, 16.0), 0);

        result = 100.0 + 102.0;
        Assert.assertEquals(result, classTest.add(100.0 + 102.0),0);

        result = 0.0 + .1;
        Assert.assertEquals(result, classTest.add(0.0, .1),0);

    }

    @Test (expected = java.lang.ArithmeticException.class)
    public void testAddFail() throws ArithmeticException{
        double result = 101.0 + 23.0 + (-1.0) + 16.0;
        // Compare that to what Math gives us
        Math.isEquals(result, classTest.add(10.0, 23.0, -1.0, 16.0));

        result = 1001.0 + 102.0;
        Math.isEquals(result, classTest.add(100.0 + 102.0));

        result = 10.0 + .1;
        Math.isEquals(result, classTest.add(0.0, .1));


    }

    @Test
    public void testSubtract() {

        double result = 100.0 - 230.0 - (-10.0) - 160.0;
        // Compare that to what Math gives us
        Assert.assertEquals(result, classTest.subtract(100.0, 230.0, -10.0, 160.0),0);

        result = 100.0 - 102.0;
        Assert.assertEquals(result, classTest.subtract(100.0,102.0),0);

        result = 0.0 - .1;
        Assert.assertEquals(result, classTest.subtract(0.0, .1),0);


    }


    @Test (expected = java.lang.ArithmeticException.class)
    public void testSubtractFail() throws ArithmeticException{

        double result = 1001.0 - 230.0 - (-10.0) - 160.0;
        // Compare that to what Math gives us
        Math.isEquals(result, classTest.subtract(100.0, 230.0, -10.0, 160.0));

        result = 100.0 - 102.0;
        Math.isEquals(result, classTest.subtract(100.0,102.0));

        result = 0.0 - .1;
        Math.isEquals(result, classTest.subtract(0.0, .1));


    }

    @Test
    public void testMultiply() {

        double result = 100.0 * 23.0 * -100.0 * 1600.0;
        // Compare that to what Math gives us
        Assert.assertEquals(result, classTest.multiply(100.0, 23.0, -100.0, 1600.0),0);

        result = 1000.0 * 1002.0;
        Assert.assertEquals(result, classTest.multiply(1000.0,1002.0),0);

        result = 0.0 * .11;
        Assert.assertEquals(result, classTest.multiply(0.0, .11),0);


    }

    @Test (expected = java.lang.ArithmeticException.class)
    public void testMultiplyFail() throws ArithmeticException{

        double result = 1100.0 * 23.0 * -100.0 * 1600.0;
        // Compare that to what Math gives us
        Math.isEquals(result, classTest.multiply(100.0, 23.0, -100.0, 1600.0));

        result = 1000.0 * 1002.0;
        Math.isEquals(result, classTest.multiply(1000.0,1002.0));

        result = 0.0 * .11;
        Math.isEquals(result, classTest.multiply(0.0, .11));


    }

    @Test
    public void testDivide() {

        double result = 10001.0 / 5101.0;
        // Compare that to what Math gives us
        Assert.assertEquals(result, classTest.divide(10001.0, 5101.0),0);

        result = 100.0 / 12.0;
        Assert.assertEquals(result, classTest.divide(100.0,12.0),0);

        result = 10.0 / 1.11;
        Assert.assertEquals(result, classTest.divide(10.0, 1.11), 0);


    }

    @Test (expected = java.lang.ArithmeticException.class)
    public void testDivideFail() throws ArithmeticException{

        double result = 101.0 / 5101.0;
        // Compare that to what Math gives us
        Math.isEquals(result, classTest.divide(10001.0, 5101.0));

        result = 100.0 / 12.0;
        Math.isEquals(result, classTest.divide(100.0,12.0));

        result = 10.0 / 1.11;
        Math.isEquals(result, classTest.divide(10.0, 1.11));


    }

}
