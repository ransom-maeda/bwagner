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
public class Quiz2 {

    /**
     * @param vikingName
     * @return 
     */
    
        public String getName(String vikingName)
    {
        String nameOutput = null;
        if("A".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Olaf";
        }
        else if("B".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Melnir";
        }
        else if("C".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Orkning";
        }
        else if("D".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Ivar";
        }
        else if("E".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Jarnskeggi";
        }
        else if("F".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Eddval";
        }
        else if("G".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Sven";
        }
        else if("H".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Gothorm";
        }
        else if("I".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Arfinn";
        }
        else if("J".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Hafgrim";
        }
        else if("K".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Ulf";
        }
        else if("L".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Snidil";
        }
        else if("M".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Drott";
        }
        else if("N".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Finnbogi";
        }
        else if("O".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Hildigrim";
        }
        else if("P".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Gudmund";
        }
        else if("Q".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Hoketil";
        }
        else if("R".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Saemund";
        }
        else if("S".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Thor";
        }
        else if("T".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Vignir";
        }
        else if("U".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Brynjoff";
        }
        else if("V".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Thrand";
        }
        else if("W".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Gauk";
        }
        else if("X".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Smid";
        }
        else if("Y".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Hogni";
        }
        else if("Z".equals(vikingName.substring(0,1).toUpperCase())){
            nameOutput = "Mogens";
        }
        return nameOutput;      
    }
    
    public String getQuality(int DateOfBirth){
        String quality = null;
        if(DateOfBirth == 1){
            quality = "the Reckless";
        }
        else if(DateOfBirth == 2){
            quality = "the Cunning";
        }
        else if(DateOfBirth == 3){
            quality = "the Adamant";
        }
        else if(DateOfBirth == 4){
            quality = "the Formidable";
        }
        else if(DateOfBirth == 5){
            quality = "the Terrifying";
        }
        else if(DateOfBirth == 6){
            quality = "the Unruly";
        }
        else if(DateOfBirth == 7){
            quality = "the Majestic";
        }
        else if(DateOfBirth == 8){
            quality = "the Daring";
        }
        else if(DateOfBirth == 9){
            quality = "the Gallant";
        }
        else if(DateOfBirth == 10){
            quality = "the Dauntless";
        }
        else if(DateOfBirth == 11){
            quality = "the Mighty";
        }
        else if(DateOfBirth == 12){
            quality = "the Mischevious";
        }
        else if(DateOfBirth == 13){
            quality = "the Adventurous";
        }
        else if(DateOfBirth == 14){
            quality = "the Lion-Hearted";
        }
        else if(DateOfBirth == 15){
            quality = "the Striking";
        }
        else if(DateOfBirth == 16){
            quality = "the Superior";
        }
        else if(DateOfBirth == 17){
            quality = "the Wanderer";
        }
        else if(DateOfBirth == 18){
            quality = "the Exceptional";
        }
        else if(DateOfBirth == 19){
            quality = "the Phenomenal";
        }
        else if(DateOfBirth == 20){
            quality = "the Valiant";
        }
        else if(DateOfBirth == 21){
            quality = "the Startling";
        }
        else if(DateOfBirth == 22){
            quality = "the Gutsy";
        }
        else if(DateOfBirth == 23){
            quality = "the Remarkable";
        }
        else if(DateOfBirth == 24){
            quality = "the Bewildering";
        }
        else if(DateOfBirth == 25){
            quality = "the Smashing";
        }
        else if(DateOfBirth == 26){
            quality = "the Steadfast";
        }
        else if(DateOfBirth == 27){
            quality = "the Mystifying";
        }
        else if(DateOfBirth == 28){
            quality = "the Inconceivable";
        }
        else if(DateOfBirth == 29){
            quality = "the Regal";
        }
        else if(DateOfBirth == 30){
            quality = "the Dreadful";
        }
        else if(DateOfBirth == 31){
            quality = "the Astonishing";
        }
        
        
        return quality;
    }
    
    public void manager()
    {
        String nameInput;
        int birthDate;
        Scanner input = new Scanner(System.in);
        // get input from user
        System.out.print("Enter your name - ");
        nameInput = input.nextLine();
        System.out.print("Enter your date of birth - ");
        birthDate = Integer.parseInt(input.nextLine());

        System.out.println("Your viking name is - " + getName(nameInput) + " " + getQuality(birthDate));
        
        String answer;
        System.out.print("Would you like to enter another name? (y/n) ");
        answer = input.nextLine();
        while("y".equals(answer)){
            System.out.print("Enter your name - ");
            nameInput = input.nextLine();
            System.out.print("Enter your date of birth - ");
            birthDate = Integer.parseInt(input.nextLine());
            System.out.println("Your viking name is - " + getName(nameInput) + " " + getQuality(birthDate));
            System.out.print("Would you like to enter another name? (y/n) ");
            answer = input.nextLine();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        // variables
        Quiz2 app = new Quiz2();
        app.manager();
        
    }
    
    

}
