class EmployeeC4 {
    private int empId;
    private String empName;

    EmployeeC4()// 0 arg constructor
    {
        //this(101, "Aditi");
        System.out.println("no Parameterized Construtcor");

    }

    EmployeeC4(int empId, String empName)// parameterized constructor
    {
        //this();//2 constructor cannot call eachother;
        this();
        this.empId = empId;
        this.empName = empName;
        System.out.println("Parameterized Construtcor");
    }

    void show() {
        System.out.println(empId + " " + empName);
    }
}

class Employee4 {
    public static void main(String args[]) {
        EmployeeC4 e = new EmployeeC4(2,"Adira");
         e.show();

    }
}