import java.util.Scanner;
class Prime
{
   public static void main(String args[])
   {		
		int count = 0;
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number for checking prime or not");
			int num = sc.nextInt();
			for(int i = 1; i<=num; i++) {
				if(num%i == 0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Number is prime");
			}
			else {
				System.out.println("Number is not prime");
			}

/*int temp;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any number:");
	//capture the input in an integer
	int num=scan.nextInt();
        scan.close();
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}*/