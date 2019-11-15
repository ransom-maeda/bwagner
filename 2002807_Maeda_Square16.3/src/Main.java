import java.util.*;

public class Main {
    private String word = "";   // string input by user
	
    /* This method prompts the user to enter a string. The user's
     * response is stored in the instance variable word.
     */
    public void readString()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a string - ");
        word = keyboard.nextLine();
    }
	
    /* This method returns a string of spaces equal to the 
     * length - 2.
     * @ return a string containing spaces
     * @ param length the number of spaces needed
     */
    public String getSpace(int length)
    {
        String sp = "";
        int space = length - 2;
        for(int i = 0; i < space; i++){
            sp += " ";
        }
        
        return sp;
    }
	
    /* This method displays the instance variable word
     * in a square pattern.
     */
    public void printSquare()
    {
        System.out.println(word);
        for(int i = 0; i < word.length(); i++){
        System.out.println(word.substring(i, i + 1) + getSpace(word.length()) + word.substring(word.length() -1 - i, word.length() - i));
    }
    }

    public static void main(String[] args)
    {
        Main app = new Main();
        app.readString();
        app.printSquare();
    }
}