import java.util.Scanner;
class IfElseDemo{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number 0 or 1");
		int i = sc.nextInt();
		if(i == 0 || i == 1)
		{
			System.out.println("GOOD ");	
		}
		else
		{
			System.out.println("Try Again!!");	
		
		}
		
	}
}