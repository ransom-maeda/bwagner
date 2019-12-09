/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author 2002807
 */
public class PlaySlots {
    public static void main(String[] args){
        SlotMachine slotmachine = new SlotMachine();
        boolean run = true;
        Scanner input = new Scanner(System.in);
        String answer;
        slotmachine.displayResults();
        System.out.println("Pull Lever/Quit (1/2)");
        answer = input.nextLine();
        while("1".equals(answer)){
            slotmachine.displayResults();
            System.out.println("Pull Lever/Quit (1/2)");
            answer = input.nextLine();
        }
            
        
    }
    
}
