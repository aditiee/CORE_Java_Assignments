class Employee
{
    private int empId;
    private String empName;
 Employee()//0 arg constructor
    {
        System.out.println("0 Parameterized Construtcor");
        empId =100;
        empName="Aditi";
    }
    

    Employee(int empId , String empName)//parameterized constructor 
    {
        System.out.println("Parameterized Construtcor");
        this.empId = empId;
        this.empName = empName;
    }
    void show()
    {
        System.out.println(empId+ " " +empName);
    }
}

class Employee1
{
    public static void main(String args[])
    {
        Employee e1 = new Employee();
        e1.show();
        
        Employee e2 = new Employee(101,"Alisha");
        e2.show();
    }
}