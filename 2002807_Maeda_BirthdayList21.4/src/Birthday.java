public class Birthday
{
    // instance variables
    private String Name;
    private String birthDate;
    // constructors
    public Birthday()
    {
        Name = "";
        birthDate = "";
    }
    
    public Birthday(String n, String b)
    {
        Name = n;
        birthDate = b;
    }
    // accessor methods
    public String getName()
    {
        return Name;
    }
    
    public String getNumber()
    {
        return birthDate;
    }
    // toString method
    public String toString()
   {
      return "Student Name : " + Name + "\n" + 
            "Book Number   : " + birthDate;
   }
}