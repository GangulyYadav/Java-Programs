//Java program to convert a string to lowercase
import java.util.Scanner;
public class Convert{
	public static void main(String args[]){
		System.out.println("Enter a string to convert a string to lowercase string.");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		name = name.toLowerCase();
		System.out.println(name);
	}
}