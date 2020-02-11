package com.kodilla.testing.Shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> listOfShapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        listOfShapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        listOfShapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return listOfShapes.get(n);
    }

    public List<Shape> getListOfShapes() {
        return listOfShapes;
    }

    public String showFigures() {
        String ret = "";
        for (Shape listOfShape : listOfShapes) {
            ret = ret + ", " + listOfShape;
        }
        return ret.substring(2);
    }
}
