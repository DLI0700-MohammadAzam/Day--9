package com.digit.Exceptions;

public class RethrowingExceptions {

    static void  performDivision(int numerator, int denominator)
    {
        if(denominator == 0)
            throw new ArithmeticException(" Division by zero ");
        else
            System.out.println("Division is "+(numerator/denominator));
    }
    static void calculate(int numerator, int denominator) throws ArithmeticException
    {
        performDivision(10,0);
        if(numerator<0 || denominator<0)
            throw new ArithmeticException("No number should be Zero ");
    }

    public static void main(String[] args) {
        try {
            calculate(-10, 20);
        }catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
