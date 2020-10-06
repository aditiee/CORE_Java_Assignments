package Challenge_01;

import java.util.Scanner;

public class Java_SubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER THE SIZE OF ARRAY : ");
		int n = sc.nextInt();
		int a[]= new int[n];
		System.out.print("ENTER THE ARRAY ELEMENTS : ");
		for(int i = 0 ;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.print("ARRAY ELEMENTS ARE : ");
		for(int i = 0 ;i<n;i++)
		{
			System.out.print(" " + a[i]);
			
		}
		int count = 0;
		for(int j = 0 ;j<n;j++)
		{
			int sum = 0;
			for(int k = j ;k<n;k++)
			{
				sum+=a[k];
				if(sum<0)
				{
					count++;
				}
			}
		}
		System.out.println("\nCount Of Array Elements : " + count);
		//1 -2 4 -5 1
		
	}

}
