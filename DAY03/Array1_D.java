//29.Write a program to print the total number of one-D arrays in a two-D array and the number of elements 
//in every one-D array present in the two-D arrays.
public class Array1_D {

    public static void main(String[] args) {
		int a[] = {1,2,4,6,9,8,7,4};
		int b[] = {7,9,2,3,};
        int c[] = {8,9,2,3,4,8};
        int d[] = {8,9};
		
		int arr[][] = new int[4][];
		arr[0] =a;
		arr[1]=b;
        arr[2]=c;
        arr[3]=d;
		
		int countA = 0;
		
		
		for(int ar[] : arr) {
			countA++;
			int countB = 0;
			for(int n : ar) {
				countB++;
				
			}
			System.out.println("Total number of elemnts in 1D array are :  "+countB);
		}
		System.out.println("Total number of 1D arrays are : "+countA);

	}

}
 

