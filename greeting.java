//Java program for greeting message
import java.util.Scanner;
public class greeting{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.print("Hello ");
		System.out.print(name);
		System.out.print(", have a good day!");
	}
}