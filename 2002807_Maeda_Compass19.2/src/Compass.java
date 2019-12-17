/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2002807
 */
public class Compass {

    // instance variables
    private int heading;      // current direction
    
    // methods
        /* This method updates heading by turning one degree to the right. 
     * After completing the turn, if heading is equal to 360 its value
     * is changed to 0.
     */
    public void turnRight()
    {
        heading++;
        if(heading == 360){
            heading = 0;
        }
    }

    /* This method updates heading by turning one degree to the left. 
     * After completing the turn, if heading is equal to -1 its value
     * is changed to 359.
     */
    public void turnLeft()
    {
        heading--;
        if(heading == -1){
            heading = 359;
        }
    }

    /* This method updates heading by turning the number of degrees specified by 
     * the value of the parameter deg. If deg is greater than or equal to 0 the 
     * method turns to the right deg degrees, otherwise it turns to the left 
     * deg degrees.
     */
    public void turnDegrees(int deg)
    {
        if(deg >= 0){
            for(int i = 0; i <= deg; i++){
                turnRight();
            }
        }
        else{
            for(int i = 0; i <= Math.abs(deg); i++){
                turnLeft();
            }
        }
    }

    /* This method returns the value of heading
     * @ return the current heading
     */
    public int getHeading()
    {
        return heading;
    }

    /* This method translates heading into one of the eight directional values: 
     * North, NorthEast, East, SouthEast, South, SouthWest, West, and NorthWest.
     * @ return a string representing the compass's current direction
     */
    public String getDirection()
    {
        if((heading >= 0 && heading <= 22) || (heading >= 337 && heading <= 360))
            return "North";
        else{
            if(heading > 293 && heading < 337)
            return "NorthWest";
        if(heading > 22 && heading < 67)
            return "NorthEast";
        if(heading >= 67 && heading <= 112)
            return "East";
        if(heading > 112 && heading < 157)
            return "SouthEast";
        if(heading >= 157 && heading <= 202)
            return "South";
        if(heading > 202 && heading < 247)
            return "SouthWest";
        if(heading >= 247 && heading <= 293)
            return "West";
            return "NorthWest";
        }
    }
}
