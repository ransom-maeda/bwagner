import java.util.*;

public class Averages
{
    // instance variables
    private int posCount = 0;
    private int negCount = 0;
    private int posSum = 0;
    private int negSum = 0;

    /* This method generates a 100 random numbers and determines
     * if each number is positive or negative. If the number is
     * positive it increments posCount by one and increases posSum
     * by the value of the number. If the number is negative it
     * increments negCount by one and increases negSum by the
     * value of the number.
     */
    public void tallyAndSum()
    {
        int i = 0;
        int num = 0;
        while(i <= 100){
            num = (int)(Math.random() * 2001) - 1000;
            if(num >= 0){
                posCount++;
                posSum += num;
                
            }
            else{
                negCount++;
                negSum += num;
            }
            System.out.println(num);
            i++;
        }
    }
	
    /* Calculates an average by dividing the sum by the count
     * @return the average
     * @param sum the sum that is to be averaged
     * @param count the count of the numbers to be averaged
     */
    public double average(int sum, int count)
    {   
        return ((double)sum / count);
    }

    /* This method prints a summary report displaying the count,
     * sum, and average of the positive and negative numbers.
     */
    public void printSummary()
    {
        System.out.println("           Summary\n" +
"-------------------------------\n" +
"Positive Numbers = " + posCount + "\n" + 
"Sum of Positives = " + posSum + "\n" +
"Average of Positives = " + average(posSum, posCount) +
"\n" +
"Negative Numbers = " + negCount + "\n" +
"Sum of Negatives = " + negSum + "\n" +
"Average of Negatives = " + average(negSum, negCount));
    }


    public static void main(String[] args)
    {
        Averages app = new Averages();
        app.tallyAndSum();
        app.printSummary();
    }
}