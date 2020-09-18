import java.util.Scanner;

public class Eligible{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" PERSON'S GENDER MALE(m) OR FEMALE(f): ");
		String gender = sc.next();
		System.out.print(" PERSON'S AGE :");
		int age = sc.nextInt();
		if(age >=18)
		{
			System.out.println(" PERSON IS ELIGIBLE FOR MARRIAGE");
		}
		else
		{
			System.out.println(" PERSON IS NOT ELIGIBLE FOR MARRIAGE");
		}
	}





}