import java.util.Scanner;
class Even_Odd
{
	public static void main(String args[])
	{	
		int sumEven =0 ,sumOdd = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY : ");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("ENTER ARRAY ELEMENTS :");
		for( int i=0;i<n;i++)
		{
			ar[i]= sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{		
			if(ar[i]%2 == 0)
			{		
				 sumEven = sumEven + ar[i];
			}	
			else
			{
				  sumOdd = sumOdd + ar[i];
				
			}
		}
			System.out.println(" SUM OF EVEN ARRAY ELEMENT = " + sumEven);
			System.out.println(" SUM OF ODD ARRAY ELEMENT = " + sumOdd);
		
	}

}