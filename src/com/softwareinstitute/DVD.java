package com.softwareinstitute;

public class DVD extends LibraryItem implements Borrowable {
    ///////////////////////////Attributes//////////////////////////////////
    private String director;
    private int releaseYear;




    ///////////////////////////Constructors//////////////////////////////////



    public DVD(String director, int releaseYear, String title){
        super(title);
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public DVD(String director, int releaseYear, String title, int index){
        super(index);
        this.director = director;
        this.releaseYear = releaseYear;
    }







    ///////////////////////////Methods//////////////////////////////////





    public String getDirector(){return director;}
    public int getReleaseYear(){return releaseYear;}
    public void setDirector(String director){this.director = director;}
    public void setReleaseYear(int releaseYear) {this.releaseYear = releaseYear;}


    @Override
    public void loanDuration() {

    }

    @Override
    public void director(String directorName) {

    }

    @Override
    public void author(String authorName) {

    }

    @Override
    public void releaseYear(int year) {

    }

    @Override
    public void getAuthor(String author) {

    }

    @Override
    public void getEdition(int edition) {

    }



    @Override
    public int getReleaseYear(int releaseYear) {
        return 0;
    }
}
