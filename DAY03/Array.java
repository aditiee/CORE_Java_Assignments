//26.Create an array of 17 elements in 5 rows.  And calculate sum of all elements

import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ROWS :");
		int rows = s.nextInt();
		int arr[][] = new int[rows][];
		for( int i=0;i<arr.length;i++)
		{
			System.out.println("ENTER THE COLUMN "+ i + ":" );
			int column = s.nextInt();
			arr[i]=new int[column];
			for(int j=0;j<arr.length;j++)
			{
				System.out.println("ENTER ELEMENT : ");
				arr[i][j]=s.nextInt();

			}
		
		}
		int sum=0;
		for(int ar[] : arr)
		{
			for(int a : ar){
				System.out.print(" "+a);
				sum +=a;
			}
			System.out.println("");
		
		System.out.println("Sum : " + sum);
		}
	
		s.close();

		

		
		}
	}
