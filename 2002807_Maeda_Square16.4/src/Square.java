import java.util.*;
public class Square
{
    private String word = "";   // string input by user
	
    /* This method prompts the user to enter a string. The user's
     * response is stored in the instance variable word.
     */
    public void readString()
    {
        String word = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string");
        word = keyboard.nextLine();
        
        
    }
	
    /* This method returns a string of spaces equal to the 
     * length - 2.
     * @ return a string containing spaces
     * @ param length the number of spaces needed
     */
    public String getSpace(int length)
    {
        int count = String.valueOf(length).length();
        return Integer.toString(count - 2);
    }
	
    /* This method displays the instance variable word
     * in a square pattern.
     */
    public void printSquare()
    {
        int i, j; 
        for (i = 1; i <= n; i++) 
        { 
            for (j = 1; j <= m; j++) 
            { 
                if (i == 1 || i == n ||  
                    j == 1 || j == m)             
                    System.out.print("*");             
                else
                    System.out.print(" ");             
            } 
            System.out.println(); 
        } 
        System.out.println();
    }

    public static void main(String[] args)
    {
        Square app = new Square();
        app.readString();
        app.printSquare();
    }
}
  