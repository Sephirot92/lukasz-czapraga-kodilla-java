package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expression with lambdas");
        expressionExecutor.executeExpression(10,5, (a,b) -> a+b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a-b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a*b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a/b);

        System.out.println("Calculting expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4,FunctionalCalculator::substractAFromB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        PoemBeautifier beatufiedText = new PoemBeautifier();

        System.out.println("\n Time to have fun with POemBeatufier");
        beatufiedText.textToBeautify("NaNaNaNaNa", " Shazam!", ((toBeBeatufied, beautification) -> toBeBeatufied + beautification));
        beatufiedText.textToBeautify("SHAZAAAAAAM!!!", "Wait, what...",((toBeBeatufied, beautification) -> (beautification + toBeBeatufied)));
        beatufiedText.textToBeautify("na", "ba", ((toBeBeatufied, beautification) -> beautification + toBeBeatufied +toBeBeatufied + ("!!!!!!")));
        beatufiedText.textToBeautify("shazam...!", "ugh....", ((toBeBeatufied, beautification) -> (beautification + toBeBeatufied).toUpperCase()));
        beatufiedText.textToBeautify(" SO MUCH SPACE           ", "    SIMON ", ((toBeBeatufied, beautification) -> (beautification + toBeBeatufied).trim()));
    }

}