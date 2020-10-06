package introduction;

import java.util.Scanner;

public class StdIN_StdOUT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		double d = sc.nextDouble();
		String s = sc.nextLine();
		s = sc.nextLine();
		
	
		System.out.println(s);
		System.out.println(d);
		System.out.println(i);
		
		sc.close();

	}

}
