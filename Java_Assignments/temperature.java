import java.util.Scanner;

public class temperature
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  Fahrenheit temperature :");
		double f = sc.nextDouble();
		System.out.println(" Fahrenheit temperature :" + f);
		double c = 5*(f-32)/9 ;
		System.out.println(" Celsius temperature :" + c);
		
	

	}




}