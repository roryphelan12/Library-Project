package com.softwareinstitute;

import java.util.ArrayList;

public class Main {
/////////////////////this is my library////////////////////////////////////////////
    public static void main(String[] args) {
        ArrayList<LibraryItem> Items = new ArrayList<LibraryItem>();
        LibraryItem Comic1 = new Comic("DC","john smith", "Superman");
        LibraryItem DVD1 = new DVD("Christopher Nolan",2021, "Tennet");
        LibraryItem Book1 = new Book("Lord of The Rings",1, "Christopher Tolkien");


        Items.add(Comic1);
        Items.add(DVD1);
        Items.add(Book1);

        System.out.println(DVD1.getName());
        System.out.println(Comic1.getName());
        System.out.println(Book1.getIndex());





    }



}

