import java.util.*;

public class BirthdayManager
{
    // instance variables
    private Birthday[] birthdays;     // declare array variable
    private int numPeople;     // logical size of array

    // constructor
    public BirthdayManager()
    {
        birthdays = new Birthday[20];  // instantiate array with length 20
        numPeople = 0;          // no books added yet
    }

    /* This method allows a user to input up to 20 books and stores them
       in the array books.
     */
    public void addBooks()
    {
        Scanner keyboard = new Scanner(System.in);
        String answer = "y";
        while(answer.equals("y") && numPeople < 50)
        {
            System.out.print("Enter name - ");
            String name = keyboard.nextLine();
            System.out.print("Enter Birthday - ");
            String birthday = keyboard.nextLine();
            
            birthdays[numPeople] = new Birthday(name, birthday);
            numPeople += 1;
            
            System.out.print("Enter another? [y/n]");
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
        System.out.println("*    printBirthdays    *");
        System.out.println("************************");
        
        for(int i = 0; i < numPeople; i++)
        {
            System.out.println("Name - " + birthdays[i].getName());
            System.out.println("Birthday - " + birthdays[i].getNumber());
            System.out.println("");
        }
    }

    public static void main(String[] args)
    {
        BirthdayManager app = new BirthdayManager();
        app.addBooks();
        app.printBooks();
    }
}