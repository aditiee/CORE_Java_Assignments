class Person
{
    Person()
    {
        System.out.println("No-arg Person");
    }
}

class Employee extends Person
{
    Employee()
    {
        System.out.println("No-arg Employee");
    }
}


public class EmployeeDemo11{

    public static void main(String args[])
    {
       Employee e = new Employee();// sub-class constructor always call the super-class no-arg constructor
    }
}


    

