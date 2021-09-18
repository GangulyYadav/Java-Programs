// Java program to use increment and decrement operators and find difference between postfix and prefix 
public class Unary{
	public static void main(String args[]){
		int a = 20;
		int ans1;
		
		//Original Values
		System.out.println("Value of a: " + a);
	
		// prefix increment 
		ans1 = ++a;
		System.out.println("Prefix increment : " + ans1);
	
		// postfix increment 
		ans1 = a++;
		System.out.println("Postfix increment : " + ans1);

		// prefix decrement 
		ans1 = --a;
		System.out.println("Prefix decrement : " + ans1);

		// postfix increment 
		ans1 = a--;
		System.out.println("Postfix decrement : " + ans1);
	}
}