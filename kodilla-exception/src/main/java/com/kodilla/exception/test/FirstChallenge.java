package com.kodilla.exception.test;

public class FirstChallenge {

    private double divide(double a, double b) throws ArithmeticException {
        if (b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {

        final int a = 3;
        final int b = 0;

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(a, b);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("cant divide by 0");
            System.out.println(e);
        } finally {
            System.out.println("divided " + a + " by " + b);
        }

    }
}
