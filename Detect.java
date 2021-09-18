// Java program to detect double and triple space in a string
//cwh practice set
// By Ganguly Yadav
//14th june 2021
import java.util.Scanner;
public class Detect{
	public static void main(String args[]){
		System.out.println("Enter string to detect number of spaces:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int count = 0;
		if(name.indexOf("  ")!= -1  && name.indexOf("   ")==-1)
		{
			System.out.println("There are double spaces in string!");
		}		
		if(name.indexOf("   ")!= -1)
		{
			System.out.println("There are triple spaces in string!");
		}
		else if(name.indexOf("  ")==-1 && name.indexOf("   ")==-1)
		{
			System.out.println("There are no spaces in string!");
		}
	}
}