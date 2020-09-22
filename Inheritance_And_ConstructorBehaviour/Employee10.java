class Person
{
   
    void show()
    {
        System.out.println("Person");
    }
}

class Employeeee extends Person
{
    
    void show()
    {
       
        System.out.println("Employee");
    }
}

class Mngr extends Employeeee
{
    void show()
    {
       
        System.out.println("Mngr");
    }
}

public class Employee10{

    public static void main(String args[])
    {
        //Person p = new Employeeee();//allowed o/p: "Employee"
        Person p = new Person();//o/p: "person"
        Person p1 = new Employeeee();
        Person p2 = new Mngr();
        //Employeeee e = new Person(); //not allowed
        //Person ar[]= {new Person(),new Employeeee(),new Mngr()};
        Person ar[]={p,p1,p2};
        for(Person a : ar)
        {
            a.show();
        }
    }
}


    

