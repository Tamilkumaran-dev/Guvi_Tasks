package Task30Jun.Task1;

public class Book {

    public int bookID;
    public String title;
    public String author;
    public String isAvailable;

    public Book(){
    }
    public Book(int bookID,String title,String author,String isAvailable){
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
}
