package Task30Jun.Task1;

import java.text.BreakIterator;
import java.util.Scanner;

public class BookManagementSystem {
    public static Scanner Input = new Scanner(System.in);
    public static Library lib = new Library();
    public static void main(String[] args) {

//        Book book = new Book(1, "Rich Dad poor dad", "Tamil", "Available");
//        Book book1 = new Book(2, "Phycology", "Kumaran", "Available");
//        lib.addBook(book);
//        lib.addBook(book1);
//
//        lib.DisplayBooks();
        ManagementFn();


    }
    public static void ManagementFn(){
         System.out.println("Enter the \"1 to add a book\" ");
         System.out.println("Enter the \"2 to Display the books\" ");
         System.out.println("Enter the \"3 to Replace the book\" ");
         System.out.println("Enter the \"4 to Exit\" ");
         System.out.print("Enter the Input : ");
         int UserIm = Input.nextInt();

         switch(UserIm){
             case 1:
                 int BookID = (lib.booklist.length > 0) ? lib.booklist.length : 0;
                 System.out.println("BookID is " + BookID );
                 Input.nextLine();
                 System.out.print("Enter the Book Name : ");
                 String Name = Input.nextLine();
                 System.out.print("Enter the Book Author name: ");
                 String Author = Input.nextLine();

                 Book book = new Book(BookID,Name,Author,"isAvailable");
                 lib.addBook(book);

                 System.out.println("---------------------------------------------------");
                 System.out.println("Book is successfully add");
                 System.out.println("-------------------*********-----------------------");
                 ManagementFn();
                 break;
             case 2:
                 lib.DisplayBooks();
                 System.out.println("---------------------------------------------------");
                 System.out.println("All the book has been displayed");
                 System.out.println("-------------------*********-----------------------");
                 ManagementFn();
                 break;
             case 3:
                 System.out.println("Replace");
                 System.out.print("Enter the BookID you want to relpace  : ");
                 int ReBookID = Input.nextInt();
                 Input.nextLine();
                 System.out.print("Enter the Book Name : ");
                 String ReName = Input.nextLine();
                 System.out.print("Enter the Book Author name: ");
                 String ReAuthor = Input.nextLine();

                 Book rebook = new Book(ReBookID,ReName,ReAuthor,"isAvailable");
                 lib.ReplaceBook(rebook);
                 System.out.println("---------------------------------------------------");
                 System.out.println("Book is successfully Replaced");
                 System.out.println("-------------------*********-----------------------");
                 ManagementFn();
                 break;
             case 4:
                 System.out.println("---------------------------------------------------");
                 System.out.println("Exit");
                 System.out.println("-------------------*********-----------------------");

                 break;
             default:

                 System.out.println("---------------------------------------------------");
                 System.out.println("there is no action in this number");
                 System.out.println("-------------------*********-----------------------");
                 ManagementFn();
                 break;
         }


    }
}
