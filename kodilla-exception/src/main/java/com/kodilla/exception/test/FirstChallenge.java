package com.kodilla.exception.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FirstChallenge {
    public double divide (double a, double b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException();
        }


        return a / b;
    }


    public static void main (String[] args){
        FirstChallenge firstChallenge = new FirstChallenge();

        try {

            firstChallenge.divide(3,0);

        }catch (ArithmeticException e){

            System.out.println("Issue detected!" + e);

        }finally{
            System.out.println("I hope you enjoyed this :)");
        }

    }
}

//        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))){
//
//        fileLines.forEach(System.out::println);
//
//        }catch (IOException e){
//
//        System.out.println("Oh no, something went wrong!" + e);
//
//        }finally{
//        System.out.println("i'm gonna be here always!!");
//        }