package com.softwareinstitute;

public class DVD extends LibraryItem {
    ///////////////////////////Attributes//////////////////////////////////
    private String director;
    private int releaseYear;




    ///////////////////////////Constructors//////////////////////////////////

    public DVD(){}

    public DVD(String director, int releaseYear, String title) {
        super(title);
        this.director = director;
        this.releaseYear = releaseYear;
    }








    ///////////////////////////Methods//////////////////////////////////


    public void title(String title){
        System.out.println("The title is "+title);
    }
    public void index(int index){
        System.out.println("The index is "+index);
    }


    public String getDirector(){return director;}
    public int getReleaseYear(){return releaseYear;}
    public void setDirector(String director){this.director = director;}
    public void setReleaseYear(int releaseYear) {this.releaseYear = releaseYear;}
}
