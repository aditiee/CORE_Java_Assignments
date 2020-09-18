import java.util.Scanner;

public class Swapping{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER FIRST NUMBER : ");
		int a = sc.nextInt();
		System.out.print("ENTER SECOND NUMBER : ");
		int b = sc.nextInt();
		System.out.println("VALUES BEFORE SWAPPING:" + a + " and " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("VALUES AFTER SWAPPING:" + a + " and " + b);
	}


}