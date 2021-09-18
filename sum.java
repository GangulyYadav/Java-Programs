//Java program to do sum of three numbers 
// 26th-may-2021
import java.util.Scanner;   // to take input
public class sum{
	public static void main(String[] args){
		System.out.println("Enter three numbers do sum: ");
		Scanner inp = new Scanner(System.in);  //scanner object created
		int n1,n2,n3,sum=0;
		n1 = inp.nextInt();  //taking input
		n2 = inp.nextInt();
		n3 = inp.nextInt();
		sum = n1+n2+n3;      //storing in sum variable
		System.out.println("The sum of them is :");
		System.out.println(sum);
	}
}


