package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultOfAdding = calculator.add(1,2);
        double resultOfSubtraction = calculator.sub(1,2);
        double resultOfMultiply = calculator.mul(1,2);
        double resultOfDivision = calculator.div(1,2);
        //Then
        Assert.assertEquals(3,resultOfAdding,0.0001);
        Assert.assertEquals(-1,resultOfSubtraction,00001);
        Assert.assertEquals(2,resultOfMultiply,0.0001);
        Assert.assertEquals(0.5,resultOfDivision,0.0001);

    }
}
