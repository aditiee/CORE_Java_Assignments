import java.util.Scanner;
public class Circle{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float radius = sc.nextFloat();
		System.out.println("Radius of the circle : " + radius);	
		double area = 3.14*radius*radius;
		System.out.println("Area of the circle : " + area);
		double circumference = 2*3.14*radius;
		System.out.println("Circumference of the circle : " + circumference);	
	}


}
