class Person
{
    Person()
    {
        System.out.println("No-arg Person");
    }
    Person(int i)
    {
        System.out.println("Param Person");
    }
}

class Employee extends Person
{
    Employee()
    {
        System.out.println("No-arg Employee");
    }
    Employee(int i)
    {
        System.out.println("Param Employee");
    }
}


public class EmployeeDemo12{

    public static void main(String args[])
    {
       Employee e = new Employee();// sub-class constructor always call the super-class no-arg constructor
       Employee e1 = new Employee(12);
    }
}


    

