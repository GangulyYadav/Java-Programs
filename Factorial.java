// Java Program to find factorial of a number
// cwh practice set question 5
// By Ganguly Yadav
// 13th-July-2021

import java.util.Scanner;

public class Factorial{
	public static int factorial=1;
	static int fact(int n){
		for(int i=1;i<=n;i++){
			factorial *= i;
		}	
		return factorial;	
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find out the factorial: ");
		int number = sc.nextInt();
		factorial = (number==0)?factorial=1:fact(number);
		System.out.println("The factorial of " +number+" is : "+factorial);
	}	
}