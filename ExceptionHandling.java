// Java Program to use exception handling
// By Ganguly Yadav
// 30th July 2021

import java.util.Scanner;
public class ExceptionHandling{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers to divide:");
	int a = sc.nextInt();
	int b = sc.nextInt();
	try{
	    System.out.println("The division of "+a+" and "+b+" is "+(a/b));
	}
	catch(ArithmeticException e){
	    System.out.println("You cannot divide number with 0!!!");
	} 
    }
}