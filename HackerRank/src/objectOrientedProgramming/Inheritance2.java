package objectOrientedProgramming;
class Arithmetic
{
	int add(int a,int b)
	{
		int sum = a+b;
		return sum;
	}
	
}
class Adder extends Arithmetic
{
	
}
public class Inheritance2 {

	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println("My SuperClass is : " + a.getClass().getSuperclass().getName());
		System.out.println(a.add(10,32) + " " + a.add(10, 3)+ " " + a.add(10, 10));
	}

}
