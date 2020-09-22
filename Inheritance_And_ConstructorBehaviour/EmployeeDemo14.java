class Person
{
    Person()
    {
        this(45);//3
        System.out.println("No-arg Person");
    }
    Person(int i)
    {           //4
        System.out.println("Param Person");
    }
}

class Employee extends Person
{
    Employee()
    {
        this(12);//1
        System.out.println("No-arg Employee");
    }
    Employee(int i)
    {
       //2
        System.out.println("Param Employee");
    }
}


public class EmployeeDemo14{

    public static void main(String args[])
    {
      
       Employee e1 = new Employee();
    }
}


    

