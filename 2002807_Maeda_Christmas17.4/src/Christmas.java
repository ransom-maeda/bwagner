import java.util.*;

public class Christmas
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        for(int i = 1; i <= 12; i++)       // go from 1st day to 12th day
        {

          if(i == 1)
            System.out.println("On the first day of Christmas my true love gave to me");
          if(i == 2)
            System.out.println("On the second day of Christmas my true love gave to me");
          if(i == 3)
            System.out.println("On the third day of Christmas my true love gave to me");
          if(i == 4)
            System.out.println("On the fourth day of Christmas my true love gave to me");
          if(i == 5)
            System.out.println("On the fifth day of Christmas my true love gave to me");
          if(i == 6)
            System.out.println("On the sixth day of Christmas my true love gave to me");
          if(i == 7)
            System.out.println("On the seventh day of Christmas my true love gave to me");
          if(i == 8)
            System.out.println("On the eighth day of Christmas my true love gave to me");
          if(i == 9)
            System.out.println("On the ninth day of Christmas my true love gave to me");
          if(i == 10)
            System.out.println("On the tenth day of Christmas my true love gave to me");
          if(i == 11)
            System.out.println("On the eleventh day of Christmas my true love gave to me");
          if(i == 12)
            System.out.println("On the twelfth day of Christmas my true love gave to me");
             
          for(int counter = i; counter >= 1; counter--){
              
          
          if(counter == 1){
           if(counter == i)     System.out.println("a partridge in a pear tree.");
           else System.out.println("and a partridge in a pear tree.");
          }
             else if(counter == 2)
                System.out.println("two turtledoves,");
             else if(counter == 3)
                System.out.println("three French hens,");
             else if(counter == 4)
                System.out.println("four calling birds,");
             else if(counter == 5)
                System.out.println("five gold rings,");
             else if(counter == 6)
                System.out.println("six geese a-laying,");
             else if(counter == 7)
                System.out.println("seven swans a-swimming,");
             else if(counter == 8)
                System.out.println("eight maids a-milking,");
             else if(counter == 9)
                System.out.println("nine ladies waiting,");
             else if(counter == 10)
                System.out.println("ten lords-a-leaping,");
             else if(counter == 11)
                System.out.println("eleven pipers piping,");
             else if(counter == 12)
                System.out.println("twelve drummers drumming,");
             
          }
    String pause = keyboard.nextLine();  // pause : Press Enter to continue
          
        }
    }
}