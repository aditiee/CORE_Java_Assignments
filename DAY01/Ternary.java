import java.util.Scanner ;
class Ternary {

	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers");
	int i = sc.nextInt();
	int j = sc.nextInt();
	int k = sc.nextInt();

	String s =(i > j && i > k)? i +"i is greater": (j>k && j>i) ? j+" is greater" : k+" is greater";
System.out.println(s);
	}




}
