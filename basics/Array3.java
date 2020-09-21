import java.util.Scanner;
class Array3
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
		System.out.println("ARRAY ELEMENTS ARE :");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
			
		}


	}




}
//traversing