import java.util.Scanner;
public class SimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("~~~~~~~Simple Interest Calculator~~~~~~~");
		System.out.println("Enter the amount:");
		int principal = sc.nextInt();
		System.out.println("Enter the rate of interest:");
		float rate = sc.nextFloat();
		System.out.println("Enter the number of months:");
		int time = sc.nextInt();
		float simpleInterest = principal * rate * time / 100;
		System.out.println("The simple interest is : " + simpleInterest);
	}
}