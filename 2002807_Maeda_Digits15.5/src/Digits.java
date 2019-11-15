import java.util.*;

public class Digits
{
    /* This method continually divides parameter num
     * by 10 as long as num is greater than 0. The
     * number of divisions performed equals the number
     * of digits in num.
     * @ return the count of the number of digits in num
     * @ param num the number to be divided
     */
    public int getDigitCount(int num)
    {
        int digitCount = String.valueOf(num).length();
        return digitCount;
    }

    /* This method continually divides parameter num
     * by 10 as long as num is greater than 0. Before
     * each division operation, it calculates and prints
     * the remainder of num divided by 10.
     */
    public void printDigits(int num)
    {
        while(num > 0){
            System.out.println(num % 10);
            num = (num / 10);
        }
    }

    /* This method prompts the user to enter a number.
     * It then makes a call to methods getDigitCount
     * and printDigits using the number entered by
     * the user as a parameter for both.
     */
    public void manager()
    {
        Scanner keyboard = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter a number - ");
        number = keyboard.nextInt();

        System.out.println();
        System.out.println("Digit Count = " + getDigitCount(number));
        System.out.println();
        System.out.println("Digits");
        System.out.println("------");
        printDigits(number);
    }



    public static void main(String[] args)
    {
        Digits app = new Digits();
        app.manager();
    }
}