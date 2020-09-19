import java.util.Scanner;

public class GreatestTernary{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER FIRST NUMBER : ");
		int num1 = sc.nextInt();
		System.out.print("ENTER SECOND NUMBER : ");
		int num2 = sc.nextInt();
		System.out.print("ENTER THIRD NUMBER : ");
		int num3 = sc.nextInt();
		String str = (num1 >num2 && num1>num3)?(num1 +"is the greatest"):(num2 >num1 && num2>num3)?(num2 + "is the greatest"):(num3 >num1 && num3>num2)?(num3 +"is the greatest"):("ALL ARE EQUAL ");
		System.out.println(str);
	}


}
