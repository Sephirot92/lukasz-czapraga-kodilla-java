package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapes= new ArrayList<Shape>();

    public void addFigure(Shape shape){
        shapes.add(shape);
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure (int n){
       Shape choice = shapes.get(n);
       return choice;
    }
    public int showFigures(){
        int result = shapes.size();

        for(int i =0; i < shapes.size(); i ++){
            System.out.println(shapes.get(i));
        }

        return result;
    }
}
