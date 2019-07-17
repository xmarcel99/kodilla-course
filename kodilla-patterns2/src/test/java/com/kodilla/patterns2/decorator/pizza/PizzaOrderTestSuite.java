package com.kodilla.patterns2.decorator.pizza;

import javafx.beans.binding.When;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testPriceOfAllDecorators() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        //When
        BigDecimal price = theOrder.getPrice();
        //Then
        Assert.assertEquals(new BigDecimal(30),price);
    }

    @Test
    public void testPizzaDescriptionOfAllDecorators() {
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new OlivesDecorator(theOrder);
        theOrder = new SalamiDecorator(theOrder);
        //When
        String pizzaDescription = theOrder.getPizzaDescription();
        //Then
        Assert.assertEquals("Pizza with: pizza dough, tomato sauce, cheese"+", extra cheese"+", olives"+", salami",pizzaDescription);
    }
}
