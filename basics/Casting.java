class Casting{

	public static void main(String args[]){

		byte b =12;
		int i = b; // implicitly "upcasting"
		System.out.println(i);

		int j = 127;
		//byte b1 = j; explicitly downcasting we have to do conversion here
		byte b1 = (byte)j;
		System.out.println(b1);
		}





}