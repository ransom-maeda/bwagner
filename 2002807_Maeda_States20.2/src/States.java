/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2002807
 */
public class States {

    // instance variables
    private String name;      // The state's name
    private String bird;      // The state's bird
    private String flower;    // The state's flower
    private String song;      // The state's song
    private String motto;     // The state's motto
    private String tree;      // The state's tree
    // constructors 
   public States()
    {
        name = "";    
    }
    
    public States(String n, String b, String f, String s, String m, String t)
    {
        name = n;
        bird = b;
        flower = f;
        song = s;
        motto = m;
        tree = t;
    }
    
    // toString method
    public String toString()
    {
        return "State Name   : " + name + "\n" +
          "State Bird   : " + bird + "\n" +
          "State Flower : " + flower + "\n" +
          "State Song   : " + song + "\n" +
          "State Motto  : " + motto + "\n" +
          "State Tree   : " + tree;
    }
}
