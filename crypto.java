//Java program to encrypt a grade by adding 8 bit to it decrypt it to show the correct grade
import java.util.Scanner;
public class crypto{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Protect your data by encrypting:");
		System.out.println("Enter your grade:");
		char grade = sc.next().charAt(0);
		
		//Encrypting grade 
		grade = (char)(grade + 8);
		System.out.println("Ecrypted to:" + grade );
		
		//Decrypting grade
		grade = (char)(grade - 8 );
		System.out.println("Decypted to:" + grade );
	}
}
