package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main (String[] args) {

        SimpleUser simpleuser = new SimpleUser("theForumUser");

        String result = simpleuser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("Test ok");
        } else {
            System.out.println("Error ! ");
        }

        System.out.println("Test - pierwszy test jednostkowy: ");

        Calculator calculator = new Calculator();

        int addResult = calculator.add(3,4);
        int subtractResult = calculator.subtract(50,47);

        if (addResult == 7) {
            System.out.println("Test ok");
        } else {
            System.out.println("Error ! ");
        }

        System.out.println("Test - drugi test jednostkowy: ");

        if (subtractResult == 3) {
            System.out.println("Test ok");
        } else {
            System.out.println("Eroor");
        }
    }
}
