import java.util.Scanner;

public class Salary 
{
    	public static void main( String[] args ) 
    	{
		Scanner reader = new Scanner(System.in);
	
		float bs, gs, da, hra;

		System.out.print("\nEnter basic salary:");
		bs = reader.nextFloat();
	
		if (bs<10000)
		{
			hra = bs * 10 / 100;
			da = bs * 90 / 100;
		}
		else
		{
			hra = 2000;
			da = bs * 98 / 100;
		}
		gs = bs + hra + da;
		System.out.print("\nGross salary = Rs." + gs);
    }

}