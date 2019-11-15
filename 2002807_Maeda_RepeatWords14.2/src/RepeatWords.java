import java.util.Scanner;

public class RepeatWords {
    public static void main(String[] args)
    {
        // variables
        Scanner sc = new Scanner(System.in);
        String word = "";
        int count = 0;

        // input / calculation
        System.out.println("Enter words, type 'stop' or 'exit' to stop: \n");
        while(!word.equalsIgnoreCase("stop") && (!word.equalsIgnoreCase("exit"))) {
            word = sc.next();
            count++;
        }

        // output
        System.out.println("You entered " + (count - 1) + " words.");
    }
}