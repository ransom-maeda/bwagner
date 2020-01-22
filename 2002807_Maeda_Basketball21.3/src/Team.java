import java.util.*;

public class Team
{
    // instance variables
    private Player[] players;
    private int numPlayers;
    
    
    // constructor
    public Team()
    {
        players = new Player[20];  // instantiate array with length 20
        numPlayers = 0;          // no players added yet
        
    }

    /* This method allows a user to input up to 20 basketball players and 
     *  stores them in an array.
     */
    public void addPlayers()
    {
        Scanner keyboard = new Scanner(System.in);
        String answer = "y";
        while(answer.equals("y") && numPlayers < 20)
        {
            System.out.print("Enter player name - ");
            String name = keyboard.nextLine();
            System.out.print("Enter free throws made - ");
            int FreeThrowsMade = keyboard.nextInt();
            System.out.print("Enter free throws attempted - ");
            int FreeThrowsAttempted = keyboard.nextInt();
            System.out.print("Enter 2 pt field goals made - ");
            int TwoFGMade = keyboard.nextInt();
            System.out.print("Enter 2 pt field goals attempted - ");
            int TwoFGAttempted = keyboard.nextInt();
            System.out.print("Enter 3 pt field goals made - ");
            int ThreeFGMade = keyboard.nextInt();
            System.out.print("Enter 3 pt field goals attempted - ");
            int ThreeFGAttempted = keyboard.nextInt();
            keyboard.nextLine();
            
            players[numPlayers] = new Player(name, FreeThrowsMade, FreeThrowsAttempted, TwoFGMade, TwoFGAttempted, ThreeFGMade, ThreeFGAttempted);
            numPlayers += 1;
            
            System.out.print("Enter another player? [y/n]");
            answer = keyboard.nextLine();
            
            System.out.println("");
        }

    }

    /* This method displays each Player in the array 
     */
    public void printPlayers()
    {
        System.out.println("************************");
        System.out.println("*      printPlayers    *");
        System.out.println("************************");
        
        for(int i = 0; i < numPlayers; i++)
        {
            System.out.println("Player Name - " + players[i].getPlayer ());
            System.out.println("Free throw % - " + players[i].getFTPercentage());
            System.out.println("2 point Field Goal % - " + players[i].getFG2Percentage());
            System.out.println("3 point Field Goal % - " + players[i].getFG3Percentage());
            System.out.println("Total Points Scored - " + players[i].getPointsScored());

        }
    }

    public static void main(String[] args)
    {
        Team app = new Team();
        app.addPlayers();
        app.printPlayers();
    }
}