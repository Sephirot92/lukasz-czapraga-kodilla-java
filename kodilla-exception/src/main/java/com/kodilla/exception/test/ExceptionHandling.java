package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main (String[] args){

        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            secondChallenge.probablyIWillThrowException(5,0);
        }catch(Exception e){
            System.out.println("Hey, I got new Exception over here!!");
        }finally{
            System.out.println("I made it Chief");
        }
    }

}
