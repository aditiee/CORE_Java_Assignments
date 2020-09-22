class Person
{
    void getDetail()
    {
        System.out.println("Person Details");
    }
    void getJob()
    {
        System.out.println("Person Job");
    }
}
class Employee extends Person
{
    void getJob()
    {
        System.out.println("Employee Job" );
    }

    void getDept()
    {
        System.out.println("Employee Dept" );
        
    }
}


public class EmployeeDemo15 {

    public static void main(String args[])
    {
        Employee p = new Employee();
        //Person p = new Person();
       // Person p = new Employee();
        p.getDetail();
        p.getJob();
        p.getDept();
    }
    
}
