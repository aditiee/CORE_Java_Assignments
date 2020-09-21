class EmployeeC2 {
    private int empId;
    private String empName;

    EmployeeC2()// 0 arg constructor
    {
        this(101, "Aditi");
        System.out.println("no Parameterized Construtcor");

    }

    EmployeeC2(int empId, String empName)// parameterized constructor
    {

        this.empId = empId;
        this.empName = empName;
        System.out.println("Parameterized Construtcor");
    }

    void show() {
        System.out.println(empId + " " + empName);
    }
}

class Employee2 {
    public static void main(String args[]) {
        EmployeeC2 e = new EmployeeC2();
        e.show();

    }
}