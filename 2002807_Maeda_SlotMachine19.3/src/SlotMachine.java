import java.util.*;


public class SlotMachine
{
/* This method randomly selects a fruit for each of the three rollers.
 */
 

// constants 
    public final int CHERRIES = 0;
    public final int APPLE = 1;
    public final int ORANGE = 2;
    public final int LEMON = 3;
    public final int BANANA = 4;
	
    // instance variables
    private int roller1;  
    private int roller2;   
    private int roller3;   
    private int cash = 50;     // $50 is the amount of money you start with
    
    String[] fruit = {"cherries ", "apples ", "orange ", "lemon ", "banana "};
    
    // methods
        public void pullLever()
    {
        roller1 = (int)(Math.random()* 5);
        roller2 = (int)(Math.random()* 5);
        roller3 = (int)(Math.random()* 5);
    }

    /* This method displays the type of fruit contained in each roller.
     */
    public void displayRollers()
    {
        System.out.print(fruit[roller1]);
        System.out.print(fruit[roller2]);
        System.out.print(fruit[roller3]);
    }
    /* This method determines the amount of pay off when there is a winner
     * @ return the amount of payoff
     */
    private int getPayOff()
    {
        int payOff = 0;
        int randomNum = (int)(Math.random() * ((9 - 0) + 1)) + 0;
        if(randomNum >= 0 && randomNum < 6) payOff = (int)(Math.random() * ((10 - 1) + 1)) + 1;
        else if(randomNum >= 6 && randomNum < 9) payOff = (int)(Math.random() * ((10 - 11) + 1)) + 11;
        else payOff = 10000;
        return payOff;
    }

    /* This method displays the results of pulling the lever.
     */
    public void displayResults()
    {
        cash -= 1;
        if(roller1 == roller2 && roller2 == roller3){
            System.out.println("******************");
            System.out.println("     Winner       ");
            System.out.println("******************");
            System.out.println("You won $" + getPayOff());
        }
        else{
            System.out.println("No winner. Please try again");
            System.out.println("cash = $" + cash);
        }
    }   
    
} 