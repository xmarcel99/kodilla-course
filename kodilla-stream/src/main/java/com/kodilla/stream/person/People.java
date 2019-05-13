package com.kodilla.stream.person;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class People {
    final List<String> theList = new ArrayList<>();

    public People() {

        theList.add("John Smith");
        theList.add("Dorothy Newman");
        theList.add("John Wolkowitz");
        theList.add("Lucy Riley");
        theList.add("Owen Rogers");
        theList.add("Matilda Davies");
        theList.add("Declan Booth");
        theList.add("Corinne Foster");
        theList.add("Khloe fry");
        theList.add("Martin Valenzuela");

    }

    public List<String> getList() {

        return new ArrayList<String>(theList);

        //return theList;

    }


}