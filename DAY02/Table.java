import java.util.Scanner;

public class Table
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER TABLE NUMBER :");
		int t = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			int k = t*i;
			System.out.println(t +" x " + i + " = " + k);
			
		}

	}

}