//Object Cloning : Object cloning refers to creation of exact copy of an object.
//It creates a new instance of the class of current object and initializes all 
//its fields with exactly the contents of the corresponding fields of this object.
package objectCloning;

import java.util.Scanner;

//Step 1 : IS TO CREATE A CLASS WHICH IMPLEMENTS A CLONEABLE INTERFACE
class Employee implements Cloneable
{
	String name;
	long  id;

	 Employee(String name, long id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "EMPLOYEE NAME = " + name + "\nEMPLOYEE ID =" + id ;
	}
	
	//Step 2 :  WE HAVE TO DECLARE ONE OVERRIDDEN METHOD NAME clone()
	@Override
	public Employee clone() throws CloneNotSupportedException 
	{
		return (Employee)super.clone();//this clone() method will call this super.clone()method for processing
	}
	 
	
}
public class ObjectCloning {

	public static void main(String[] args) throws CloneNotSupportedException  {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE EMPLOYEE NAME : ");
		String name = sc.nextLine();
		System.out.print("ENTER THE EMPLOYEE ID : ");
		long id =  sc.nextLong();
		//Step 3 . To create the original object
		Employee obj1 = new Employee(name , id);
		System.out.println("\nORIGINAL OBJECT : ");
		System.out.println(obj1);
		System.out.println("HASHCODE OF ORIGINAL OBJECT : " + obj1.hashCode());
		
		System.out.println(" ");
		//SHALLOW CLONING
		Employee obj2 = obj1;
		System.out.println("COPIED : ");
		System.out.println(obj2);
		System.out.println("HASHCODE OF ORIGINAL OBJECT : " + obj2.hashCode());
		
		//DEEP CLONING
		System.out.println(" ");
		//Step 4 : Cloning
		Employee obj3 = obj1.clone();//as soon as the method gets call cloned object gets created
		System.out.println("CLONED OBJECT : ");
		System.out.println(obj3);
		System.out.println("HASHCODE OF CLONED OBJECT : " + obj3.hashCode());
		
		sc.close();
		

	}

}
