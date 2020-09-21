import java.util.Scanner;
class IfElse{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number:");
		int i = sc.nextInt();
		if(i%2 == 0)
		{
			System.out.println(i+ " IS A EVEN NUMBER");	
		}
		else
		{
			System.out.println(i+ " IS A ODD NUMBER");	
		
		}
		
	}
}