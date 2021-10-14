package com.softwareinstitute;

public class Book extends LibraryItem{



    ///////////////////////////Attributes//////////////////////////////////

    private String author;
    private int edition;






    ///////////////////////////Constructors//////////////////////////////////

    public Book(String title, int edition) {
        super(title);
    }





    ///////////////////////////Methods//////////////////////////////////
    public void title(String title){
        System.out.println("The title is "+title);
    }
    public void index(int index){
        System.out.println("The index is "+index);
    }

    public int getEdition(){return edition;}
    public String getAuthor(){return author;}
    public void setAuthor(String author){this.author = author;}
    public void setEdition(int edition) {this.edition = edition;}


}
