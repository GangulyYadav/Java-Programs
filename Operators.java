import java.util.Scanner;
public class Operators{
	public static void main(String[] args){
			// Arithmatic operators
			Scanner inp = new Scanner(System.in);
			char again;
		      do{
			System.out.println("Enter two numbers :");
			float a = inp.nextFloat();
			float b = inp.nextFloat();
			System.out.println("Select any operation (+,-,*,/,%):");
			char choice = inp.next().charAt(0);	
			switch(choice){
			case '+':
				System.out.println(a+b);
			break;
			case '-':
				System.out.println(a-b);
			break;
			case '*':
				System.out.println(a*b);
			break;
			case '/':
				System.out.println(a/b);
			break;
			case '%':
				System.out.println(a%b);
			break;
			default:
				System.out.println("Invalid selection!!!");
			break;
			}
			System.out.println("Do you want to run again?(y/n)");
			again = inp.next().charAt(0);
		       }while(again=='y');
	}
}