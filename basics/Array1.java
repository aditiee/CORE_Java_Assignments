import java.util.Scanner;
class Array1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("ENTER ARRAY ELEMENTS :");
			ar[i]= sc.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			System.out.println("ARRAY ELEMENTS ARE :" +ar[i]);
			
		}


	}




}