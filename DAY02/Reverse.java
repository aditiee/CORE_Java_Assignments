import java.util.*;

public class Reverse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE NUMBER : ");
		int num = sc.nextInt();
		int rev = 0;
		while(num!=0)
		{
		int digit = num%10;
		rev = rev*10 + digit;
		num = num/10;
		}
		System.out.println("REVERSED OF GIVEN NUMBER IS " + rev );
		

	}



}