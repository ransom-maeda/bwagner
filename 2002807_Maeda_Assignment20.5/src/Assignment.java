public class Assignment
{
   // instance variables
   private String name;
   private String type;
   private int score;
   // constructors
   public Assignment()
   {
       name = "";
       type = "";
       score = 0;
   }
   
   public Assignment(String n, String t, int sc)
   {
       name = n;
       type = t;
       score = sc;
   }
   // accessor methods
   public String getName()
   {
       return name;
   }
   
   public String getType()
   {
       return type;
   }
   
   public int getScore()
   {
       return score;
   }
   // mutator methods
   public void setName(String n)
   {
       name = n;
   }
   
   public void setType(String t)
   {
       type = t;
   }
   
   public void setScore(int sc)
   {
       score = sc;
   }
   // other methods
   public String getLetterGrade()
   {
       if(score >= 90 && score <= 100) return "A";
       else if(score >= 80 && score <= 89) return "B";
       else if(score >= 70 && score <= 79) return "C";
       else if(score >= 60 && score <= 69) return "B";
       else return "F";
   }


}