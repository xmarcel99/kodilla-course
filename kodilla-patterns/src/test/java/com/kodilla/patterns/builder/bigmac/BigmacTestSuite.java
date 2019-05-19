package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmackBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sezam")
                .burgers(2)
                .ingredients("egg")
                .sauce("spicy")
                .ingredients("orange")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredientsList().size();
        //Then
        Assert.assertEquals(2,howManyIngredients);
    }
}
