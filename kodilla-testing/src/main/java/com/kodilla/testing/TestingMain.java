package com.kodilla.testing;

import com.kodilla.testing.Shapes.Circle;
import com.kodilla.testing.Shapes.ShapeCollector;
import com.kodilla.testing.Shapes.Square;
import com.kodilla.testing.Shapes.Triangle;

import java.util.ArrayList;
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
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(4.18));
        shapeCollector.addFigure(new Triangle(4, 3.2));
        shapeCollector.addFigure(new Square(2.0));

        shapeCollector.showFigures();
        shapeCollector.getFigure(3);

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
