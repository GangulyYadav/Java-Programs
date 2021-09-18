//Java program to replace spaces with underscore
import java.util.Scanner;
public class Replace{
	public static void main(String args[]){
		System.out.println("Enter a String to replace all spaces with _ .");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		name = name.replace(" ","_");
		System.out.println(name);
	}	
}