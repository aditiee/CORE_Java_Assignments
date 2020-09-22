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


public class EmployeeDemo17 {

    public static void main(String args[])
    {
       
       Person p = new Employee();//Upcasting   
      // Employee e = p;// downcasting Error -->Person cannot be coverted into zemployee
       Employee e = (Employee)p;
        e.getDetail();
        e.getJob();
        e.getDept();
    }
    
}
