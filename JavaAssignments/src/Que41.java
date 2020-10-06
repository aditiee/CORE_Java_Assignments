/* 41. Write a program to demonstrate this() construct functionality.
*/



import java.util.Scanner;

class Student{
	private int rollno;
	private String name;
	
	Student(){
		
	}
	
	Student(int rollno,String name){
		this.rollno = rollno;
		this.name = name;
	}
	
	void display(){
	
		System.out.println("\nName : " + name + "\nRoll no : " + rollno + "\n");
	}
	
}

class Que41{
	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE STUDENT'S NAME : ");
		String name = sc.nextLine();
		System.out.print("ENTER THE STUDENT'S ROLLNO : ");
		int rollno=sc.nextInt();
		sc.close();
		Student s1 = new Student(rollno,name);
		s1.display();
	}
}