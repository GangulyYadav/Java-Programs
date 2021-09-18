//Java Program to demostrate all the conditional statements 
// By Ganguly Yadav
import java.util.Scanner;
public class ConditionalStatements{
  public static void main(String[] args){
  	System.out.println("~~~~~~OUTPUT~~~~~~");
	System.out.println("Conditional Statements in Java");
	Scanner input = new Scanner(System.in);
	System.out.println("Which conditional statement you want to use? \n 1.Simple if \n 2.if...else \n 3.if..else..if\n 4.Nested if..else");
	int choice = input.nextInt();

	if(choice==1)
	{
	System.out.println("Simple if statements");
	System.out.println("Enter your age:");
	int age = input.nextInt();
	
	//if statement
	if(age>=18)
	{
		System.out.println("You can vote now!!");
	}
	}
	else if(choice==2)
	{
		System.out.println("if else statements");
		System.out.println("Enter your age:");
		int age = input.nextInt();
	
		//if else statement
		if(age>=18)
		{
		  System.out.println("You can vote now!!");
		}
		else
		{
		  System.out.println("You can't vote now!!");
		}
	}
	else if(choice==3)
	{
		System.out.println("if else if statements");
		System.out.println("Enter your percentage:");
		int percentage = input.nextInt();
	
		//if else if statement
		if(percentage>=90)
		{
		  System.out.println("O grade");
		}
		else if(percentage>=80)
		{
		  System.out.println("A grade");
		}
		else if(percentage>=70)
		{
		  System.out.println("B grade");
		}
		else if(percentage>=55)
		{
		  System.out.println("C grade");
		}
		else
		{
		  System.out.println("Fail!!!");
		}
	}
	else if(choice==4)
	{
		System.out.println("nested if else statements");
		System.out.println("Enter your a,b,c: to find the greatest");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();	
		//nested if else statement
		if(a>=b)
		{
		  if(a>=c)
		   System.out.println("A is greatest");
		  else
		   System.out.println("C is greatest");
		}
		else
		{
		  if(b>=c)
		   System.out.println("B is greatest");
		  else
		   System.out.println("C is greatest");
		}
	}
	else
	{
	  System.out.println("Invalid choice entered!!!");
	}
  }
}