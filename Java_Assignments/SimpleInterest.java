import java.util.Scanner;

public class SimpleInterest{

		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("ENTER THE PRINCIPAL AMOUNT : ");
			float p = sc.nextFloat();
			System.out.print("ENTER THE RATE :" );
			float r = sc.nextFloat();
			System.out.print("ENTER THE TIME : ");
			float t = sc.nextFloat();
			double SI = (p*r*t)/100;
			System.out.println("SIMPLE INTEREST : " + SI);
		}


}