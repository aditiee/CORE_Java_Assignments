package Challenge_01;

import java.util.Scanner;

public class PowerSum {


	static int totnum(double d,int N,int num){
	    if(Math.pow(num,N)<d)
	        return totnum(d,N,num+1)+totnum(d-Math.pow(num,N),N,num+1);
	    else if(Math.pow(num,N)==d)
	        return 1;
	    else
	        return 0;
	}
	public static void main(String[] args) {
	
		    Scanner sc = new Scanner(System.in);
		    int X = sc.nextInt();
		    int N = sc.nextInt();
		    sc.close();
		    System.out.println(X + " " +N);
		    totnum(X,N,1);
		   
		}
}
