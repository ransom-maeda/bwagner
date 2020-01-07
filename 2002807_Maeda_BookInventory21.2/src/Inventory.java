import java.util.*;

public class Inventory
{
    // instance variables
    private Book[] books;     // declare array variable
    private int numBooks;     // logical size of array

    // constructor
    public Inventory()
    {
        books = new Book[20];  // instantiate array with length 20
        numBooks = 0;          // no books added yet
    }

    /* This method allows a user to input up to 20 books and stores them
       in the array books.
     */
    public void addBooks()
    {
        Scanner keyboard = new Scanner(System.in);
        String answer = "y";
        while(answer.equals("y") && numBooks < 20)
        {
            System.out.print("Student name - ");
            String name = keyboard.nextLine();
            System.out.print("Book Number - ");
            String bookNumber = keyboard.nextLine();
            
            books[numBooks] = new Book(name, bookNumber);
            numBooks += 1;
            
            System.out.print("Enter another book? [y/n]");
            answer = keyboard.nextLine();
            
            System.out.println("");
        }

    }

    /* This method displays the student name and book number for each 
     * Book in the array.
     */
    public void printBooks()
    {
        System.out.println("************************");
        System.out.println("*       printBooks     *");
        System.out.println("************************");
        
        for(int i = 0; i < numBooks; i++)
        {
            System.out.println("Student name - " + books[i].getName());
            System.out.println("Book Number - " + books[i].getNumber());
        }
    }

    public static void main(String[] args)
    {
        Inventory app = new Inventory();
        app.addBooks();
        app.printBooks();
    }
}