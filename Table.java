//Java program to display table using do while loop
// By Ganguly Yadav
// 12th July 2021
import java.util.Scanner;
public class Table{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to display table : ");
		int number = sc.nextInt();
		int i = 1;	
		do{
			System.out.println(number+" X "+i+" = "+number*i); 
			i++;
		}while(i<=10);
	}
}