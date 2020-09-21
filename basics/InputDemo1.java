import java.util.Scanner;

class InputDemo1{
	public static void main(String args[])
	{	Scanner sc = new Scanner(System.in);
		System.out.println("ENTER a number : ");
		int i = sc.nextInt();
		System.out.println("ENTER another number : ");
		int j = sc.nextInt();
		int k = i + j;
		System.out.println("sum =  "+ k);
	}
} 