package Task30Jun.Task1;

public class Library {
    public Book[] booklist;     //attribute array of objects

    public Library(){
        this.booklist = new Book[0];   // when create object this will create array of object
    }

    // Adding method
    public void addBook(Book adbok){       // The Book is data type (Object) book is the variable
        Book[] Tembook = this.booklist;
        booklist =new Book[this.booklist.length + 1];

        for(int i = 0;i<booklist.length;i++){
            if(i<Tembook.length) {
                booklist[i] = Tembook[i];
            }
            else {
                booklist[i] = adbok;
            }
        }
    }

    //Display
    public void DisplayBooks(){
        for(int i=0;i<this.booklist.length;i++){
            System.out.println("-----------------------------------------------------------");
            System.out.println("BookID : " + this.booklist[i].bookID);
            System.out.println("title : " + this.booklist[i].title);
            System.out.println("author : " + this.booklist[i].author);
            System.out.println("isAvailable : " + this.booklist[i].isAvailable);
        }
    }

    //Replace
    public void ReplaceBook(Book Rebok){
        if(this.booklist.length>Rebok.bookID) {
            this.booklist[Rebok.bookID] = Rebok;
        }
        else{
            System.out.println("there is not book in that ID");
        }
    }

}
