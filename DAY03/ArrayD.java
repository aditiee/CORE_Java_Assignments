//30.Create an integer type 2-D array of size [3X3]. Take the elements from the user and then calculate the sum
// of the elements present in the diagonal.
import java.util.*;
public class ArrayD {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows : ");
		int rows = sc.nextInt();
		int arr[][] = new int[rows][];
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println("Enter coloum for row "+i+" : ");
			int col = sc.nextInt();
			arr[i] = new int[col];
			for(int j = 0 ; j < arr[i].length ; j++ ) {
				System.out.println("Enter element : ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		int sum = 0 ;
		for(int i = 0 ; i <arr.length ; i++) {
			for(int j= 0 ; j <arr[i].length ; j++) {
				System.out.print(" "+arr[i][j]);
				
				if( i == j ) {
					sum = sum + arr[i][j];
				}
				
			}
			System.out.println("");
		}
		
		System.out.println("Sum of diagonal element is : "+sum);
		
		

	}

}
