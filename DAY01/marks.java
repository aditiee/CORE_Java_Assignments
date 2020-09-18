import java.util.Scanner;

public class marks
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		float total =m1+m2+m3+m4+m5;
		float percentage =(total/500)*100;
		System.out.println("TOTAL MARKS : "+total);
		System.out.println("PERCENTAGE : "+percentage +"%");
	
	}




}