
package objectCloning;

import java.util.Scanner;


class Employee1 
{
	String name ,id;

	 Employee1(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "EMPLOYEE NAME = " + name + "\nEMPLOYEE ID =" + id ;
	}
	
	
}
public class ObjectCloning1 {

	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE EMPLOYEE NAME : ");
		String name = sc.nextLine();
		System.out.print("ENTER THE EMPLOYEE ID : ");
		String id =  sc.nextLine();
	
		Employee1 obj1 = new Employee1(name , id);
		System.out.println("\nORIGINAL OBJECT : ");
		System.out.println(obj1);
		System.out.println("ADDRESS OF ORIGINAL OBJECT : " + obj1.hashCode());
		
		System.out.println(" ");
		
		Employee1 obj2 = obj1;
		System.out.println("COPIED : ");
		System.out.println(obj2);
		System.out.println("ADDRESS OF ORIGINAL OBJECT : " + obj2.hashCode());
		sc.close();
		

	}

}
