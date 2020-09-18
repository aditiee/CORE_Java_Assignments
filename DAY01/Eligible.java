import java.util.Scanner;

public class Eligible{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" PERSON'S GENDER MALE(m) OR FEMALE(f): ");
		char gender = sc.next.charAt(0);
		System.out.print(" PERSON'S AGE :");
		int age = sc.nextInt();
		if( ch == 'm' && age >=21){
				System.out.println("Person is Eligible for Marriage");
			}
			else if ( ch == 'f' && age >=18){
				System.out.println("Person is Eligible for Marriage");
			}
			else{	
				System.out.println("Person is not Eligible for Marriage");
			}
	}





}
