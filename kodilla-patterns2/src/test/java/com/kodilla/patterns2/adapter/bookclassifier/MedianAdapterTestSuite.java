package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book = new Book("John","Go to forest",1999,"dsad");
        Book book1 = new Book("Freddy","HOw to be a programer",1654,"prgrfgds");
        Book book2 = new Book("Jessie","How to meka money",2055,"fdfdsf");
        Set<Book> books = new HashSet<>(Arrays.asList(book,book1,book2));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        Assert.assertEquals(1999,median);
    }
}
