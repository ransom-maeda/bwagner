public class Book
{
    // instance variables
    private String studentName;
    private String bookNumber;
    // constructors
    public Book()
    {
        studentName = "";
        bookNumber = "";
    }
    
    public Book(String n, String b)
    {
        studentName = n;
        bookNumber = b;
    }
    // accessor methods
    public String getName()
    {
        return studentName;
    }
    
    public String getNumber()
    {
        return bookNumber;
    }
    // toString method
    public String toString()
   {
      return "Student Name : " + studentName + "\n" + 
            "Book Number   : " + bookNumber;
   }
}