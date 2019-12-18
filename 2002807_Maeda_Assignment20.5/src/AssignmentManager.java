import java.util.*;

public class AssignmentManager
{  
    
    Assignment blankAssignment = new Assignment();
    Assignment sampleAssignment = new Assignment("Ransom", "Quiz", 35);
    
    private Assignment newAssignment;
    
   public void PrintAssignment()
   {
       Scanner keyboard = new Scanner(System.in);
       Assignment newAssignment = new Assignment();
       
       System.out.println("/**************************************/");
       System.out.println("/*     Test Default Constructor       */");
       System.out.println("/*     and Accessor methods           */");
       System.out.println("/**************************************/");
       System.out.println("Type         : " + blankAssignment.getType());
       System.out.println("Name         : " + blankAssignment.getName());
       System.out.println("Score        : " + blankAssignment.getScore());
       System.out.println("Letter Grade : " + blankAssignment.getLetterGrade());
       
       
       System.out.println("/**************************************/");
       System.out.println("/*     Test 2nd Constructor       */");
       System.out.println("/*     and Accessor methods           */");
       System.out.println("/**************************************/");
       System.out.println("Type         : " + sampleAssignment.getType());
       System.out.println("Name         : " + sampleAssignment.getName());
       System.out.println("Score        : " + sampleAssignment.getScore());
       System.out.println("Letter Grade : " + sampleAssignment.getLetterGrade());
       
       
       System.out.println("/**************************************/");
       System.out.println("/*     Test Mutator Methods           */");
       System.out.println("/*     and Accessor methods           */");
       System.out.println("/**************************************/");
       System.out.print("Type         : ");
       String type = keyboard.nextLine();
       System.out.print("Name         : ");
       String name = keyboard.nextLine();
       System.out.print("Score        : ");
       int score = keyboard.nextInt();
       newAssignment.setScore(score);
       System.out.print("Letter Grade : " + newAssignment.getLetterGrade());
       
   }	
   
   public static void main(String[] args)
   {
       AssignmentManager Assignment = new AssignmentManager();
       Assignment.PrintAssignment();
   }
}
