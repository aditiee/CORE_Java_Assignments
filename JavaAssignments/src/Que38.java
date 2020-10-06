/* methods.
38. Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
a. Only parameterized constructor. [Do not overload the constructor]
b. totalSalary always represents salary total of all the employees created.
c. empNo should be auto incremented.
d. display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and calls Employee method to display no. of employees and total of their salaries.
*/


import java.util.Scanner;

class Employeee{
	
	private int empNo;
	private double salary;
	private static double totalSalary;
	// static double totalSalary;
	Employeee(double salary){
		
		this.salary = salary;
		totalSalary += salary;
	}
	void displayEmployee(){
		
		System.out.println("\nEmployee No. : " + empNo + "  Salary : " + salary);
	}
	void setEmpNo(int i){
		empNo = i;
	}

	static void  displayTotalSalary(){
		System.out.println("\nTotal Salary : " + totalSalary);
	}
}

class Que38{
	
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Employee : ");
		int no = sc.nextInt();
		Employeee arr[] = new Employeee[no];
		for(int i=0;i<no;i++){
			
			System.out.println("Enter Salary for "+(i+1)+"th Employee : " );
			double str = sc.nextDouble();
			arr[i] = new Employeee(str);
			arr[i].setEmpNo(i+1);
		}


		for(Employeee i : arr){
			
			i.displayEmployee();
		}
		Employeee.displayTotalSalary();
		//Employee.totalSalary;\
		sc.close();
	}
}
	
	
