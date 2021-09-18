//Java program to check whether the entered digit is int or not
import java.util.Scanner;
public class checknum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		System.out.println(sc.hasNextInt());
	}
}