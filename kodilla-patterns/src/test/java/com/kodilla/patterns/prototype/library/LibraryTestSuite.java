package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.HashSet;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library copyLibrary = null;
        Library library = new Library("library");
        Book b0 = new Book("Book 1","John Bravo",LocalDate.of(2019,5,12));
        Book b1 = new Book("Book 2","Bruce Lee",LocalDate.of(1777,12,13));
        library.getBooks().add(b0);
        library.getBooks().add(b1);
        //When
        //shallowCopy
        try {
             copyLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        //deepCopy
        try {
            copyLibrary = library.shallowCopy();
            copyLibrary.name = "copy library";
            copyLibrary.books = new HashSet<>();
            for(Book book : library.getBooks()) {
                copyLibrary.books.add(new Book(book.getTitle(),book.getAuthor(),book.getPublicationDate()));
            }
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        library.getBooks().remove(b0);
        //Then
        System.out.println(library);
        System.out.println(copyLibrary);
        Assert.assertEquals(1,library.getBooks().size());
        Assert.assertEquals(2,copyLibrary.getBooks().size());
    }
}
