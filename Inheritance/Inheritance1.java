class Employee {
    private int empId;
    private String empName;
    void set(int empId, String empName)
    {
        this.empId = empId;
        this.empName = empName;
    }
    void show()
    {
        System.out.println(empId+" "+empName );
    }
   

}
class Manager extends Employee
{
    private int ta;
    private int da;
    void set(int empId, String empName,int ta, int da)
    {
        set(empId,empName);//method overloading
        this.ta = ta;
        this.da = da;
    }
    void show()
    {
        //show();// method overriding in this case method will call itself just like recursive call 
        super.show();// in this case the control goes to the super class method
        System.out.println(ta+" "+da );
    }
    
}

class Inheritance1 {
    public static void main(String args[]) {
        Manager m = new Manager();
        m.set(101,"ram",9000,600);
        m.show();

    }
}
