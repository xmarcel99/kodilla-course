package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends  Prototype{
     String name;
     Set<Book> books = new HashSet<>();

    public Library( String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }
    public Library shallowCopy() throws  CloneNotSupportedException{
        return (Library)super.clone();
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}