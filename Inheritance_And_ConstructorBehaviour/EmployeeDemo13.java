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
        super(12);//by default it will be added by compiler if this is not written then only added // it will call no-arg constructor
        System.out.println("No-arg Employee");
    }
    Employee(int i)
    {
        super(i);
        System.out.println("Param Employee");
    }
}


public class EmployeeDemo13{

    public static void main(String args[])
    {
       Employee e = new Employee();// sub-class constructor always call the super-class no-arg constructor
       Employee e1 = new Employee(12);
    }
}


    

