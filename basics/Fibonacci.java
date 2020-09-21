public class Fibonacci{
	public static void main(String args[]){

	int n,t1=0, t2=1;
	System.out.println("Fibonacci Series upto" + n+" numbers:");
	for(int i=1;i<=n;i++)
	{
		System.out.print(t1 + "\n");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
	}

}
}