import java.util.Scanner;
class ArrayTraversing2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[3];
		System.out.println("ENTER ARRAY ELEMENTS :");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]= sc.nextInt();
		}
		for(int a : ar)
		{
			System.out.println(a);
		}


	}




}