class EmployeeC3 {
    private int empId;
    private String empName;

    EmployeeC3(int empId)// 0 arg constructor
    {
        this(empId, "Aditi");
        System.out.println("no Parameterized Construtcor");

    }

    EmployeeC3(int empId, String empName)// parameterized constructor
    {

        this.empId = empId;
        this.empName = empName;
        System.out.println("Parameterized Construtcor");
    }

    void show() {
        System.out.println(empId + " " + empName);
    }
}

class Employee3 {
    public static void main(String args[]) {
        EmployeeC3 e = new EmployeeC3(123);
        e.show();

    }
}