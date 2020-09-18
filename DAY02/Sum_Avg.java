import java.util.Scanner;

public class Sum_Avg
{
	public static void main(String args[])
	{
		int n,sum=0;
		float average;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER ELEMENTS YOU WANT IN YOUR ARRAY :");
		n = sc.nextInt();
		int a[] =  new int[n];
		System.out.println("ENTER THE ARRAY ELEMENTS : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum = sum + a[i];
		}
		System.out.println("SUM OF ARRAY ELEMENTS IS : " + sum);
		average =(float)sum/n;
		System.out.println("AVERAGE OF ARRAY ELEMENTS IS: " + average);
		
	}
}