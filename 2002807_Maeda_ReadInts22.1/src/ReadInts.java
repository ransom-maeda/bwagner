/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author 2002807
 */
public class ReadInts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner scan = new Scanner(new File("Integers.txt"));
        int n = 0;
        int count = 0;
        int sum = 0;
        while(scan.hasNextInt())   // reads all the integers from the file
        {
            n = scan.nextInt();
            System.out.print(n + " ");
            sum += n;
            count++;       
        }
        
        System.out.println("");
        System.out.println("Count - " + count);
        System.out.println("Sum - " + sum);
    }
    
}
