public class Player
{
    // instance variables
    String playerName;
    int ftm;
    int fta;
    int fg2m;
    int fg2a;
    int fg3m;
    int fg3a;
    // constructors
    public Player(String p, int ftm1, int fta1, int fg2m1, int fg2a1, int fg3m1, int fg3a1)
    {
        playerName = p;
        ftm = ftm1;
        fta = fta1;
        fg2m = fg2m1;
        fg2a = fg2a1;
        fg3m = fg3m1;
        fg3a = fg3a1;
    }
    // accessor methods
    public String getPlayer()
    {
        return playerName;
    }
    public int getFtm()
    {
        return ftm;
    }
    public int getFta()
    {
        return fta;
    }
    public int getFg2m()
    {
        return fg2m;
    }
    public int getFg2a()
    {
        return fg2a;
    }
    public int getFg3m()
    {
        return fg3m;
    }
    public int getFg3a()
    {
        return fg3a;
    }
    
    // other methods
    public double getFTPercentage()
    {
        return ((double)ftm / fta) * 100;
    }
    
    public double getFG2Percentage()
    {
        return ((double)fg2m / fg2a) * 100;
    }
    
    public double getFG3Percentage()
    {
        return ((double)fg3m / fg3a) * 100;
    }
    
    public int getPointsScored()
    {
        return (ftm + fg2m * 2 + fg3m * 3);
    }
}