package exceptionHandling;

import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			try
			{
				int result = x/y;
				System.out.println(result);
			}
			catch(Exception e)
			{
				System.out.println("java.lang.ArithmeticException: / by zero");
			}
		}
		catch(Exception e)
		{
			System.out.println("java.util.InputMismatchException");
		}
		
		
		sc.close();

	}

}
