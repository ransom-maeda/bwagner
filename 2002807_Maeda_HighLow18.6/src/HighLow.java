import java.util.Arrays;
public class HighLow
{
    private double[] array = new double[10];
    private double[] below = new double[10];
    private double[] above = new double[10];

    /* This method populates array with random real numbers in the range
     * of 0-99 calculated to two decimal places.
     */
    public void populateArray()
    {
        double value = 0;
        for(int i = 0; i <= 10; i++){
            double num = ((int)(Math.random() * 10000)) / 100.0;
            value += num;
           
        }
    }

    /* This method calculates the average of the numbers stored in array.
     * @return the average
     */
    public double average()
    {
        double sum = 0;
        for(int u = 0; u < array.length; u++){
            sum += array[u];
        }
        return sum / array.length;
    }

    /* This method populates the below array with all the values in array
     * that are less than the average.
     * @return the logical size of below
     */
    public double populateBelow()
    {
        double sum = 0;
        for(int u = 0; u < array.length; u++){
            sum += array[u];
        }
        double average = (sum / array.length);
        
        for (int i = 0; i < array.length; i++)  
            if (array[i] < average)  {
                below[i] = array[i];               
        }
        return below[10];
    }

    /* This method populates the above array with all the values in array
     * that are greater than the average.
     * @return the logical size of above
     */
    public double populateAbove()
    {
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        double average = (sum / array.length);
        
        for (int i = 0; i < array.length; i++)  
            if (array[i] > average)  {
                above[i] = array[i];               
        }
        return above[10];
    }

    /* Given an array and its logical size this method prints each number
     * in the array horizontally across the screen with a space between
     * each one.
     * @param list the array to be printed
     * @param size the logical size of the array
     */
    public void printArray(double[] list, double size)
    {
        System.out.println("Array - " + Arrays.toString(array));
   }

    /* This method prints the summary report.
     */
    public void printSummary()
    {
        double lowestSize = populateBelow();
        double highestSize = populateAbove();

        System.out.print("Array = ");   // print original array
        printArray(array, array.length);
        System.out.println();

        System.out.println("Average = " + average());  //print average

        System.out.print("Below = ");     // print  below array
        printArray(below, lowestSize);
        System.out.println();

        System.out.print("Above = ");     // print above array
        printArray(above, highestSize);
        System.out.println();
    }

    public static void main(String[] args)
    {
        HighLow app = new HighLow();
        app.populateArray();
        app.printSummary();
    }
}