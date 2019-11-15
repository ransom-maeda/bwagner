/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.text.*;
/**
 *
 * @author 2002807
 */
public class Payroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // variables 
        Scanner keyboard = new Scanner(System.in);
        String name;
        double grossPay,
                withholdRate = 0.15,
                socialSecRate = 0.062,
                medicareRate = 0.0145,
                withholdTotal,
                socialSecTotal,
                medicareTotal,
                deductionTotal,
                netPay;
        
        
        // input
        System.out.print("Enter your full name  - ");
        name = keyboard.nextLine();
        System.out.print("Enter your monthly pay - ");
        grossPay = Double.parseDouble(keyboard.nextLine());
        
        // calculations
        withholdTotal = (withholdRate * grossPay);
        socialSecTotal = (socialSecRate * grossPay);
        medicareTotal = (medicareRate * grossPay);
        deductionTotal = (withholdTotal + socialSecTotal + medicareTotal);
        netPay = (grossPay - deductionTotal);
        
        // 2 decimal places
        DecimalFormat decFormat = new DecimalFormat("#.00");
        String withholdOutput = decFormat.format(withholdTotal);
        String socialSecOutput = decFormat.format(socialSecTotal);
        String medicareOutput = decFormat.format(medicareTotal);
        String deductionOutput = decFormat.format(deductionTotal);
        String netPayOutput = decFormat.format(netPay);
        
        // output
        System.out.println("---------- Deductions ----------");
        System.out.println("Federal Withholding - $" + withholdOutput);
        System.out.println("Social Security - $" + socialSecOutput);
        System.out.println("Medicare - $" + medicareOutput);
        System.out.println("Total Deductions - $" + deductionOutput);
        
        System.out.println("---------- Net Pay ----------");
        System.out.println("Employee - " + name);
        System.out.println("Net Pay - $" + netPayOutput);
        
        
        
        
        System.out.println("\n \n \n I don't know how to do dollar signs");
    }
    
}
