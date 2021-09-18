//Java program to fill in a letter template which looks like below
//  letter = "Dear <|name|>, Thanks a lot"
// Replace <|name|> with a string (some name)
import java.util.Scanner;
public class StrReplace{
	public static void main(String args[]){
		System.out.println("Enter name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String letter = "Dear <|name|>, Thanks a lot";
		letter = letter.replace("<|name|>",name);
		System.out.println(letter);				
	}
}