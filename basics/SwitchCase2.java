import java.util.Scanner;
class SwitchCase2{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.print("ENTER THE CHARACTER : ");
	char ch = sc.next().charAt(0);
	switch(ch)
	{
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println(ch +" Is a lowercase Vowel");
			break;
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :
			System.out.println(ch +" Is a uppercase Vowel");
			break;
		
		default :
			System.out.println(ch + " Is not a Vowel");
			break;

	}



	}





}