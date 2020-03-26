package com.kodilla.exception.test;

public class ExceptionHandling {

    public void exceptionHandling() {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1, 3);
        } catch (Exception e) {
            System.out.println("exception is here");
        } finally {
            System.out.println("done");
        }
    }
}
