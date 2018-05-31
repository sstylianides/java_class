package edu.stephanstylianides.advancedjava;

public class Math implements Add, Subtract, Divide, Multiply {


    @Override
    public double add(double... numbers) {
        double result = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            result = result + numbers[i];
        }

        return result;

    }

    @Override
    public double divide(double... numbers) {
        double result = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            result /= numbers[i];
        }

        return result;
    }

    @Override
    public double multiply(double... numbers) {
        double result = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            result = result * numbers[i];
        }

        return result;
    }

    @Override
    public double subtract(double... numbers) {
        double result = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            result = result - numbers[i];
        }

        return result;
    }

    public static void isEquals(double result1, double result2) throws ArithmeticException{
        if(result1 != result2){
            throw new ArithmeticException("these numbers are not equal");
        }

    }
}
