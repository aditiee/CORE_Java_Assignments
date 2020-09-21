class MultiDimensional
{
	public static void main(String args[])
	{
		int a[] = {1,2,3};//3 1-D array
		int b[] = {4,5,6};
		int c[] = {7,8,9};
		int arr[][] = new int[3][];// 2-D array
		arr[0] =a;
		arr[1]=b;
		arr[2]=c;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(" "+arr[i][j]);
			
			}
			System.out.println(" ");

		}




	}




}