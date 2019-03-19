package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class StreamMain {
    public static void main(String[] args) {


        SaySomething saySomething = new SaySomething();
        saySomething.say();

        Processor processor = new Processor();
        processor.execute(()-> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10,5,(a,b)->a+b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Marcel",(str)-> "ABC" + str + "ABC");
        poemBeautifier.beautify("Marcel",(str)-> str.toUpperCase());
        poemBeautifier.beautify("Marcel",(str)-> str+str);
        poemBeautifier.beautify("Marcel",(str)-> {
             String tab[] = str.split("");

             int counter = 0;
             for(String x : tab) {
                tab[counter] = x+ counter;
                counter++;
             }
            return tab[0]+tab[1]+tab[2]+tab[3]+tab[4]+tab[5];
        });


    }
}