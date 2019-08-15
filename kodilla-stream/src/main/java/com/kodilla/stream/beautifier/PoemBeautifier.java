package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void textToBeautify(String toBeBeatufied, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(toBeBeatufied);
        System.out.println("Result equals " + result);
    }
}
