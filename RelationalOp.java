//Java program to use Relational operators
import java.util.Scanner;
public class RelationalOp{
	public static void main(String args[]){
		System.out.println("~~~~~~~Relational Operators~~~~~~~");
		System.out.println("Enter a and b:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a==b);
		System.out.println(a!=b);		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
	}
}