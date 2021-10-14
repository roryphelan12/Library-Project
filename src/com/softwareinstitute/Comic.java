package com.softwareinstitute;


public class Comic extends LibraryItem {
    ///////////////////////////Attributes//////////////////////////////////
    private String brand;
    private String author;




    ///////////////////////////Constructors//////////////////////////////////


    public Comic(String title) {
        super(title);
    }

    public Comic(int index) {
        super(index);
    }







    ///////////////////////////Methods//////////////////////////////////
    public void title(String title){
        System.out.println("The title is "+title);
    }
    public void index(int index){
        System.out.println("The index is "+index);
    }

    public String getBrand(){return brand;}
    public String getAuthor(){return author;}
    public void setAuthor(String author){this.author = author;}
    public void setBrand(String brand) {this.brand = brand;}
}
