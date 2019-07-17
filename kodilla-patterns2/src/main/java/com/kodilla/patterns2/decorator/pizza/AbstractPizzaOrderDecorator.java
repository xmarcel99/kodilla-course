package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaOrderDecorator implements PizzaOrder{

    private PizzaOrder pizzaOrder;

    public AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getPrice() {
        return pizzaOrder.getPrice();
    }

    @Override
    public String getPizzaDescription() {
        return pizzaOrder.getPizzaDescription();
    }
}
