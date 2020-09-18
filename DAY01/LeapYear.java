import java.util.Scanner;
public class LeapYear{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE YEAR : ");
		int year = sc.nextInt();
		System.out.println(year);
		if((year%4 == 0) && (year%400 == 0) || (year%100 == 0))
		{	
			System.out.println(year + " Is a Leap year");
		}
		else
		{
			System.out.println(year + " Is not a Leap year");
		}
	} 

}