import java.util.Scanner;

public class Greatest{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER FIRST NUMBER : ");
		int num1 = sc.nextInt();
		System.out.print("ENTER SECOND NUMBER : ");
		int num2 = sc.nextInt();
		System.out.print("ENTER THIRD NUMBER : ");
		int num3 = sc.nextInt();
		if(num1 >num2 && num1>num3)
		{
			System.out.println(num1 + " Is the Greatest Among three numbers");
		}else if(num2 > num1 && num2 >num3)
		{
			System.out.println(num2 + " Is the Greatest Among three numbers");
		}
		else  if(num3>num1 && num3>num2)
		{
			System.out.println(num3 + " Is the Greatest Among three numbers");
		}
		else
		{
			System.out.println("ALL ARE EQUAL ");
		}
		
	}


}
