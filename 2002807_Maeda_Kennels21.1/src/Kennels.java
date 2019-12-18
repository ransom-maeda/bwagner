import java.util.*;

public class Kennels
{
    // instance variable
    private Dog[] dogs;     // declare array variable

    // constructor
    public Kennels()
    {
        dogs = new Dog[5];  // instantiate array with length 5
    }

    /* This method allows a user input information about 5 dogs and
     * stores this information in the array dogs.
     */
    public void addDogs()
    {
        System.out.println("************************");
        System.out.println("*       addDogs        *");
        System.out.println("************************");
        
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i >= 0 && i <= 4; i++)
        {
            
            System.out.print("Enter dog name - ");
            String name = keyboard.nextLine();
            System.out.print("Enter breed - ");
            String breed = keyboard.nextLine();
            System.out.println("");
            
            dogs[i] = new Dog(name, breed);
        }

    }

    /* This method displays the name and breed for each Dog in the array.
     */
    public void printDogs()
    {
        System.out.println("************************");
        System.out.println("*       printDogs      *");
        System.out.println("************************");
        
        for(int i = 0; i >= 0 && i <= 4; i++)
        {
           
            System.out.println("Dog name - " + dogs[i].getName());
            System.out.println("Dog breed - " + dogs[i].getBreed());
            System.out.println("");
        }
    }

    public static void main(String[] args)
    {
        Kennels app = new Kennels();
        app.addDogs();
        app.printDogs();
    }
}