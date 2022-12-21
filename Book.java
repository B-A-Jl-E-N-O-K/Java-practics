package pract1;

public class Book {
    private String author;
    private int numberOfPages;
    private int yearOfRelease;

    public Book(String author, int numberOfPages, int yearOfRelease){
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.yearOfRelease = yearOfRelease;
    }
    public Book(String author, int numberOfPages){
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.yearOfRelease = -1; //неизвестно
    }
    public Book(int numberOfPages){
        this.author = "lost in history(unknown)";
        this.numberOfPages = numberOfPages;
        this.yearOfRelease = -1;
    }
    public Book(){
        this.author = "lost in history(unknown)";
        this.numberOfPages = -1;
        this.yearOfRelease = -1;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
    public int getYearOfRelease(){
        return yearOfRelease;
    }


    public String toString(){
        return "Information about book: author - "+this.author+", numberOfPages - "+
                this.numberOfPages+", yearOfRelease - "+this.yearOfRelease;
    }
}
