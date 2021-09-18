//Java program to find out the type of website from the url
//By Ganguly Yadav
//10th July 2021
import java.util.Scanner;
public class Website{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the url of website:");
		String url = sc.nextLine();
		
		if(url.endsWith(".com")){
			System.out.println("This is a commercial website.");
		}
		else if(url.endsWith(".org")){
			System.out.println("This is a organisation website.");
		}
		else if(url.endsWith(".in")){
			System.out.println("This is a Indian website.");
		}
		else{
			System.out.println("Invalid Website!!");
		}
	}
}	