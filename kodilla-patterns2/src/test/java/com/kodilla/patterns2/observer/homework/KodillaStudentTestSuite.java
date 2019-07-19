package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class KodillaStudentTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Teacher lincolnBurrows = new Teacher("Lincoln Borrows");
        Teacher johnSmith = new Teacher("John Smitch");
        KodillaStudent michaelScofield = new KodillaStudent("Michael Scofield",lincolnBurrows);
        KodillaStudent saraTencredi = new KodillaStudent("Sara Tencredi",lincolnBurrows);
        KodillaStudent walterWhite = new KodillaStudent("Walter White",johnSmith);
        //When
        michaelScofield.addTask("Create first Rest Api Controller");
        michaelScofield.addTask("Sending request to diffrent server");
        saraTencredi.addTask("For loop");
        walterWhite.addTask("AOP - what is it ? ");
        //Then
        Assert.assertEquals(3,lincolnBurrows.getUpdateCounter());
        Assert.assertEquals(1,johnSmith.getUpdateCounter());
    }
}
