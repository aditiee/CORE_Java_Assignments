/* 39. Create class Product with three data members (pid, price, quantity) and parameterized constructor that takes values for all three data members.  
Create a main method in different class (say ProductDemo) and perform following task:
a. Accept information for five Product objects from user and store objects in an array
b. Find pid of product with highest price. 
c. Create a static method (with array of product’s object as argument) in Product class to calculate and return total amount spent on all products. ( amount spent on single product = price of product * quantity of product )
*/


import java.util.Scanner;

class product{
	
	private int pid;
	private double price;
	private int quantity;

	product(int pid,double price, int quantity){

		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
	double getPrice(){
		return price;
	}

	int getPid(){
		return pid;
	}

	static double totalAmount(product arr[]){
	
		double sum = 0;
		for(product i : arr){
			
			sum+=(i.price*i.quantity);
		}
		return sum;
	}
}

class Que39{

	public static void main(String []args){

		Scanner sc = new Scanner(System.in);
		product arr[] = new product[5];
		for(int i=0;i<5;i++){
			System.out.println("Enter Product Pid : ");
			int pid = sc.nextInt();
			System.out.println("Enter Product Price : ");
			double price = sc.nextDouble();
			System.out.println("Enter Product Quantity : ");
			int quantity = sc.nextInt();
			arr[i] = new product(pid,price,quantity);
		}

		double max = 0;
		product index = arr[0] ;
		for(product i : arr){		
			if(max < i.getPrice()){
				max = i.getPrice();
				index = i;
			}
		}
		System.out.println("\nPid with highest Price (Rs.) " + index.getPrice() + " is : " + index.getPid());
		System.out.println("\nTotal Amount Spend on All products : (Rs.) " + product.totalAmount(arr));
	}
}