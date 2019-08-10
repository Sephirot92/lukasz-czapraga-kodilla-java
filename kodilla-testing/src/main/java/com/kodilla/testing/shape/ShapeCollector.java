package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes= new ArrayList<Shape>();

    public void addFigure(Shape shape){
        Square square1 = new Square("square1", 5);
        shapes.add(square1);
    }
    public boolean removeFigure(Shape shape){
        //temporarily return true
        return true;
    }
    public Shape getFigure (int n){
        Shape theShape = null;
        if (n >= 0 && n< shapes.size()){
            theShape = shapes.get(n);
        }return theShape;
    }
    public int showFigures(){
        int result = shapes.size();
        return result;
    }
}
