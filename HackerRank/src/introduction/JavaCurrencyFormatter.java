package introduction;
import java.util.*;
import java.text.*;
import java.text.NumberFormat;
import java.util.Locale;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double payment = sc.nextDouble();
		sc.close();
		
		Locale.setDefault(new Locale("en","IN"));
		String India = NumberFormat.getCurrencyInstance().format(payment);
		Locale.setDefault(Locale.CHINA);
		String China = NumberFormat.getCurrencyInstance().format(payment);
		Locale.setDefault(Locale.US);
		String us = NumberFormat.getCurrencyInstance().format(payment);
		Locale.setDefault(Locale.FRANCE);
		String france = NumberFormat.getCurrencyInstance().format(payment);
		
		System.out.println("India : " + India);
		System.out.println("China : " + China);
		System.out.println("Us : " + us);
		System.out.println("France : " + france);
		
	}

}
