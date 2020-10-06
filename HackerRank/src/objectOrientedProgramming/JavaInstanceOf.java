package objectOrientedProgramming;
import java.util.*;

class Student{}
class Rockstar{}
class Hacker{}


public class JavaInstanceOf
{
	static String count(ArrayList l)
	{
		int a =0 ,b=0,c=0;
		for(int i =0;i<l.size();i++)
		{
			Object element = l.get(i);
			if(element instanceof Student)
				a++;
			if(element instanceof Rockstar)
				b++;
			if(element instanceof Hacker)
				c++;
		}
		String r = "COUNT OF STUDENTS : " + Integer.toString(a)+
					"\nCOUNT OF ROCKSTAR : " +Integer.toString(b)+
					"\nCOUNT OF HACKER : " +Integer.toString(c);
		return r;
	}
	public static void main(String args[])
	{
		ArrayList l = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String s = sc.next();
			if(s.equals("Student"))
				l.add(new Student());
			if(s.equals("Rockstar"))
				l.add(new Rockstar());
			if(s.equals("Hacker"))
				l.add(new Hacker());
		}
		System.out.println(count(l));
		sc.close();
	
	}
}