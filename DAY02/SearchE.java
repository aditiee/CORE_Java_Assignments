import java.util.Scanner;
class SearchE
{
	public static void main(String args[])
	{	
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY : ");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("ENTER ARRAY ELEMENTS :");
		for(  i=0;i<n;i++)
		{
			ar[i]= sc.nextInt();
		}
		System.out.println("ENTER ARRAY ELEMENT TO BE SEARCH :");	
		int SE = sc.nextInt();
		for(  i=0;i<n;i++)	
		{
			if(SE == ar[i])
			{
				System.out.println(SE + "  IS FOUND AT INDEX: " + i);
				break;
			}
		}
		if ( i == n)
		{
				System.out.println(SE + " IS NOT PRESENT IN THE ARRAY!!");
		}
		
		
		
	}
}