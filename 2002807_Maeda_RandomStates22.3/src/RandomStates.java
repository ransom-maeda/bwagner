/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2002807
 */
public class RandomStates {

    
    String[] states = new String[50];
    int numStates;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        RandomStates app = new RandomStates();
        Scanner keyboard = new Scanner(System.in);
        Scanner scan;
        
        try
        {
            scan = new Scanner(new File("states.txt"));
            String n = "";
            
            while(scan.hasNextLine())
            {
                n = scan.nextLine();
                System.out.println(n);
            }
            System.out.println();
            
            System.out.println("Press <Enter> to view a random state");
            System.out.println();
            
            while(true)
            {
                keyboard.nextLine();
                app.inputStates();
                app.getRandomState();
                
                System.out.println();
            }
        }
        catch(FileNotFoundException ex) {
            Logger.getLogger(RandomStates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inputStates()
    {
        Scanner scan;
        
        try
        {
            scan = new Scanner(new File("states.txt"));
            String n = "";
            
            while(scan.hasNextLine())
            {
                for(int i = 0; i < 50; i++)
                {
                    n = scan.nextLine();
                    states[i] = n;
                    numStates++;
                }
            }
        }
        catch(FileNotFoundException ex){
            Logger.getLogger(RandomStates.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getRandomState()
    {
        Random rand = new Random();
        int randomState = rand.nextInt(states.length);
        System.out.println("--> " + states[randomState]);
    }
    
}
