class Person
{
    private String name;
    void set(String name)
    {
        this.name=name;

    }
    void show()
    {
        System.out.println(name);
    }
}

class Employeee extends Person
{
    private float salary;
    void set(String name,float salary)
    {
        set(name);
        this.salary=salary;

    }
    void show()
    {
        super.show();
        System.out.println(salary);
    }
}

class Managerr extends Employeee
{
    private String dept;
    void set(String name,float salary, String dept)
    {
        set(name,salary);
        this.dept=dept;
    }
    void show()
    {
        super.show();
        System.out.println(dept);
    }
}


public class Multilevel {

    public static void main(String args[])
    {
        Managerr m = new Managerr();
        m.set("Aditi",999999.99f,"CS");
        m.show(); 
    }
}


    

