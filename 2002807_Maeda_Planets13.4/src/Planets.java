import java.util.*;

public class Planets
{
    private int planet;     // planet number selected from menu
    private int weight;     // users weight on earth
    private Scanner keyboard = new Scanner(System.in);

    /** Displays a menu of the eight planets and prompts the
     *  user to select a planet by number. The users response
     *  is store in the variable planet.
     */
    public void inputPlanet()
    {
        System.out.print("   Planets\n" +
"=============\n" +
"1. Mercury\n" +
"2. Venus\n" +
"3. Mars\n" +
"4. Jupiter\n" +
"5. Saturn\n" +
"6. Uranus\n" +
"7. Neptune\n" +
"8. Pluto\n" +
"Select planet(1-8) - ");
        planet = Integer.parseInt(keyboard.nextLine());
    }

    /* Prompts the user to enter his/her weight on Earth.
     * The user's response is stored in the variable weight.
     */
    public void inputWeight()
    {
        System.out.print("Enter your weight on Earth - ");
        weight = Integer.parseInt(keyboard.nextLine());
    }

    /* This method calculates the adjusted weight of a person by
     * multiplying his/her weight by the parameter gravity. 
     * @ return a person's adjusted weight 
     * @ param gravity the force of gravity on a particular planet
     */
    public double getWeight(double gravity)
    {

       return weight * gravity;
    }
	
   /* Determines which planet the user selected from the menu then
    * displays the planet's name along with how much the user
    * would weight on that planet.
    */
    public void printNewWeight()
    {
        if(planet == 1){
            System.out.println("Your weight on Mercury is " + getWeight(0.38));
        }
        else if(planet == 2){
            System.out.println("Your weight on Venus is " + getWeight(0.78));
        }
        else if(planet == 3){
            System.out.println("Your weight on Mars is " + getWeight(0.39));
        }
        else if(planet == 4){
            System.out.println("Your weight on Jupiter is " + getWeight(2.65));
        }
        else if(planet == 5){
            System.out.println("Your weight on Saturn is " + getWeight(1.17));
        }
        else if(planet == 6){
            System.out.println("Your weight on Uranus is " + getWeight(1.05));
        }
        else if(planet == 7){
            System.out.println("Your weight on Neptune is " + getWeight(1.23));
        }
        else if(planet == 8){
            System.out.println("Your weight on Pluto is " + getWeight(0.05));
        }
    }

    public static void main(String[] args)
    {
        Planets app = new Planets();

        app.inputPlanet();
        app.inputWeight();
        app.printNewWeight();
    }
}