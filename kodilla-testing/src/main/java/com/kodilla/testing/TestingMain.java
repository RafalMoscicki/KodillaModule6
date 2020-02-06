package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TestingMain {

    public static void main(String[] args){

//        Calculator calculator = new Calculator(4, 2);
//
//        int addResult = calculator.getA() + calculator.getB();
//        int subtractResult = calculator.getA() - calculator.getB();
//
//        if (addResult == calculator.add()) {
//            System.out.println("test ok");
//        } else {
//            System.out.println("error");
//        }
//
//        if (subtractResult == calculator.subtract()) {
//            System.out.println("test ok");
//        } else {
//            System.out.println("error");
//        }
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> arrayList = initArrayList(10);
        ArrayList<Integer> oddArrayList = oddNumbersExterminator.exterminate(arrayList);
        System.out.println(Arrays.toString(oddArrayList.toArray()));

    }

    private static Random randomNumber = new Random();

    private static ArrayList<Integer> initArrayList(int size) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i < size; i++) {
            list.add(i, randomNumber.nextInt());
        }
        return list;
    }
}
