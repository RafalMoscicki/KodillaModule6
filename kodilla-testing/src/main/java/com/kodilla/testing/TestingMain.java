package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
//        SimpleUser simpleUser = new SimpleUser("theForumUser");
//
//        String result = simpleUser.getUsername();
//
//        if (result.equals("theForumUser")) {
//            System.out.println("test ok");
//        } else {
//            System.out.println("error");
//        }

        Calculator calculator = new Calculator(4, 2);

        int addResult = calculator.getA() + calculator.getB();
        int subtractResult = calculator.getA() - calculator.getB();

        if (addResult == calculator.add()) {
            System.out.println("test ok");
        } else {
            System.out.println("error");
        }

        if (subtractResult == calculator.subtract()) {
            System.out.println("test ok");
        } else {
            System.out.println("error");
        }
    }
}
