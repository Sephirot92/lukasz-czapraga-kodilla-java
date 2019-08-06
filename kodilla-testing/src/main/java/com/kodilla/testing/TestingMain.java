package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;
import sun.java2d.pipe.SpanShapeRenderer;

public class TestingMain {
        public static void main (String[] args){
            SimpleUser simpleUser = new SimpleUser("theForumUser");

            String result = simpleUser.getUsername();

            if(result.equals("theForumUser")){
                System.out.println("Test OK");
            }else{
                System.out.println("Error Blyat!!");
            }
            Calculator calculator = new Calculator(10,3);
            int addResult = calculator.addAToB();
            
            if(addResult ==13){
                System.out.println("Well done my lord");
            }else{
                System.out.println("Wel... this went bad");
            }
            int substractResult = calculator.substractAFromB();
            
            if(substractResult == 7){
                System.out.println("Mision accomplished");
            }else{
                System.out.println ("Mission failed...");
            }
        }
}
