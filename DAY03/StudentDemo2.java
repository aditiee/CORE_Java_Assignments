 class Student {


    private int rollno;
    private String name;
    public int count = 0;

    void setData(int rollno, String name)
    {
        this.rollno = rollno;
        this.name=name;
        count++;
    }

    void showData()
    {
        System.out.println("COUNT OF STUDENTS : " + count);
        System.out.println(rollno + "        " +name);

    }
    
}
public class StudentDemo2
{
    public static void main(String args[])
    {
        Students s1 = new Students();
        s1.setData(001, "kiran bobade");
        s1.showData();

        
        Students s2 = new Students();
        s2.setData(002, "Pranay dhopte");
        s2.showData();

        
        Students s3 = new Students();
        s3.setData(003, "Rakhi kumari chahaun");
        s3.showData();
        
        
        Students s4 = new Students();
        s4.setData(004, "Akshay Thawale");
        s4.showData();

    }


  
}
