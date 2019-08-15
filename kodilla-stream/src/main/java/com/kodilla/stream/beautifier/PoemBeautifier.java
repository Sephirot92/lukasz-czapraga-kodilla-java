package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void textToBeautify(String toBeBeatufied, String beautification, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(toBeBeatufied, beautification);
        System.out.println("Result equals " + result);
    }
}
